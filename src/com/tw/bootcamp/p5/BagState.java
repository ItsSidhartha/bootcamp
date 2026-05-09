package com.tw.bootcamp.p5;

import java.util.HashMap;

public class BagState {
    private final HashMap<BallColors, Integer> balls;

    public BagState(HashMap<BallColors, Integer> balls) {
        this.balls = balls;
    }

    public HashMap<BallColors, Integer> getBalls() {
        return balls;
    }
}
