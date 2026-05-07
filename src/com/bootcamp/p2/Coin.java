package com.bootcamp.p2;

public class Coin {
    public static final int TOTAL_POSSIBILITIES = 2;
    public static final int CHANCE_OF_ONE_OUTCOME = 1;

    public Chance chance(String face) {
        return new Chance(TOTAL_POSSIBILITIES, CHANCE_OF_ONE_OUTCOME);
    }
}