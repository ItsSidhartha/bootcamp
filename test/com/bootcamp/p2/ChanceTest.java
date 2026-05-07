package com.bootcamp.p2;

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
        assertEquals(0.5, chanceOfGettingTails.value());
    }

    @Test
    void chanceOfNotGettingTailsShouldBePoint5() {
        Chance chance = new Chance(0.5);
        Chance chanceOfNotGettingTails = chance.not();
        assertEquals(0.5, chanceOfNotGettingTails.value());
    }

    @Test
    void chanceOfGettingTailsWhenTwoCoinsAreFlippedShouldBePoint75() {
        Chance chanceOfGettingTails = new Chance(0.75);
        assertEquals(0.75, chanceOfGettingTails.value());
    }
    @Test
    void chanceOfGetting3INADice() {
        Chance chanceOfGettingThree = new Chance(0.1667);
        assertEquals(0.1667, chanceOfGettingThree.value());
    }

}
