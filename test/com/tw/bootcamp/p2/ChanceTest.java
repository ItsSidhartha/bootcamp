package com.tw.bootcamp.p2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChanceTest {
    @Test
    void chanceOfSameTotalPossibilitiesAndFavorableShouldBeEqual() {
        Chance c1 = new Chance(0.5);
        Chance c2 = new Chance(0.5);
        assertEquals(c1, c2);
    }

    @Test
    void chanceOfGettingTailsShouldBePoint5() {
        Chance chanceOfGettingTails = new Chance(0.5);
        assertEquals(new Chance(0.5), chanceOfGettingTails);
    }

    @Test
    void chanceOfNotGettingTailsShouldBePoint5() {
        Chance chanceOfGettingTails = new Chance(0.5);
        Chance chanceOfNotGettingTails = chanceOfGettingTails.not();
        assertEquals(new Chance(0.5), chanceOfNotGettingTails);
    }

    @Test
    void chanceOfGettingTailsWhenTwoCoinsAreFlippedShouldBePoint75() {
        Chance firstCoinChanceOfTails = new Chance(0.5);
        Chance secondCoinChanceOfTails = new Chance(0.5);
        Chance chanceOfGettingTailsOnBoth = firstCoinChanceOfTails.and(secondCoinChanceOfTails);
        assertEquals(new Chance(0.25), chanceOfGettingTailsOnBoth);
    }

    @Test
    void chanceOfGettingAtLeastOneTailsOnFlippingTwoCoins() {
        Chance firstCoinChanceOfTails = new Chance(0.5);
        Chance secondCoinChanceOfTails = new Chance(0.5);
        Chance chanceOfGettingTailsOnAtLeastOneCoin = firstCoinChanceOfTails.or(secondCoinChanceOfTails);
        assertEquals(new Chance(0.75), chanceOfGettingTailsOnAtLeastOneCoin);
    }
}
