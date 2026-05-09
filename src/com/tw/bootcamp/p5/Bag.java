package com.tw.bootcamp.p5;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Bag {
    private final Validator validator;
    HashMap<BallColors, Integer> balls = new HashMap<>();

    public Bag(Validator validator) {
        this.validator = validator;
    }

    public boolean addBall(Ball ball) {
        balls.putIfAbsent(ball.getColor(), 0);

        if (!validator.isValid(new BagState(balls), ball)) return false;
        balls.compute(ball.getColor(), (color, count) -> count + 1);
        return true;
    }

    public String summary() {
        StringBuilder summary = new StringBuilder();
        AtomicInteger total = new AtomicInteger();

        balls.forEach((color, count) -> {
            total.addAndGet(count);
            summary.append(color).append(" : ").append(count).append("\n");
        });

        summary.append("Total : ").append(total.get());

        return summary.toString();
    }


}
