package com.tw.bootcamp.p5;

import java.util.HashMap;
import java.util.HashSet;

public class Bag {
    private final int capacity = 12;
    private final int greenBallLimit;
    HashMap<BallColors, HashSet<Ball>> balls = new HashMap<>();
    private int occupied;

    public Bag(int greenBallLimit) {
        this.greenBallLimit = greenBallLimit;
    }

    public boolean addBall(Ball ball) throws NotEnoughSpaceInBagException {
        if (occupied == capacity) throw new NotEnoughSpaceInBagException();
        balls.putIfAbsent(ball.getColor(), new HashSet<>());

        if (canAdd(ball)) {
            boolean isAdded = balls.get(ball.getColor()).add(ball);

            if (!isAdded) return false;
            occupied++;
            return true;
        }
        return false;
    }

    private boolean canAdd(Ball ball) {
        return switch (ball.getColor()) {
            case GREEN -> greenBallLimit > getSize(ball.getColor());
            case RED -> getSize(BallColors.GREEN) * 2 > getSize(ball.getColor());
            case YELLOW -> occupied * 0.4 > getSize(ball.getColor());
            case BLUE -> true;
        };
    }

    private int getSize(BallColors color) {
        if (!balls.containsKey(color)) return 0;
        return balls.get(color).size();
    }
}
