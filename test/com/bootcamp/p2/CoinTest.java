package com.bootcamp.p2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CoinTest {
    @Test
    void coin() {
        Coin coin = new Coin();
        Chance chanceOfGettingTails = coin.chance("Tails");
        assertEquals(0.5,chanceOfGettingTails.value());
    }
}