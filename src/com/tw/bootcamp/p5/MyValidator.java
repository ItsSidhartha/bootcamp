package com.tw.bootcamp.p5;

public class MyValidator implements Validator {
    private final int greenBallLimit = 3;
    private final int capacity = 10;

    @Override
    public boolean isValid(BagState bagState, Ball ball) {
        int occupied = getOccupied(bagState);
        if (occupied >= capacity) return false;

        return switch (ball.getColor()) {
            case GREEN -> greenBallLimit > getSize(bagState, ball.getColor());
            case RED -> getSize(bagState, BallColors.GREEN) * 2 > getSize(bagState, ball.getColor());
            case YELLOW -> occupied * 0.4 > getSize(bagState, ball.getColor());
            case BLUE -> true;
        };
    }

    private int getOccupied(BagState bagState) {
        return bagState.getBalls().values().stream().reduce(0, Integer::sum);
    }

    private int getSize(BagState bagState, BallColors color) {
        if (!bagState.getBalls().containsKey(color)) return 0;
        return bagState.getBalls().get(color);
    }
}
