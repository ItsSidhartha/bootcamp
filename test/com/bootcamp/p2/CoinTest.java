package com.bootcamp.p2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CoinTest {
    @Test
    void chanceOfTailsShouldBePointFive() {
        Coin coin = new Coin();
        assertEquals(0.5, coin.chance("Tails"));
    }

    @Test
    void chanceOfNotGettingTailsShouldBePointFive() {
        Coin coin = new Coin();
        assertEquals(0.5, coin.chanceOfNotGetting("Tails"));
    }
}