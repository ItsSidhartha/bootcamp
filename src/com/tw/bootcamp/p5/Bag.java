package com.tw.bootcamp.p5;

import java.util.HashMap;
import java.util.HashSet;

public class Bag {
    private final int capacity = 12;
    HashMap<BallColors, HashSet<Ball>> balls = new HashMap<>();
    private int occupied;

    public boolean addBall(Ball ball) throws NotEnoughSpaceInBagException {
        if (occupied == capacity) throw new NotEnoughSpaceInBagException();
        balls.putIfAbsent(ball.getColor(), new HashSet<>());
        boolean isAdded = balls.get(ball.getColor()).add(ball);
        if (!isAdded) return false;

        occupied++;
        return true;
    }
}
