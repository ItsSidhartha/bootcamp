package com.bootcamp.p2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChanceTest {
    @Test
    void chanceOfSameTotalPossibilitiesAndFavorableShouldBeEqual() {
        Chance c1 = new Chance(2, 1);
        Chance c2 = new Chance(2, 1);
        assertEquals(c1, c2);
    }

    @Test
    void valueOfChanceShouldBeFavorablePosibilitiesDividedByTotalPossibilities() {
        Chance chance = new Chance(2, 1);
        assertEquals(0.5, chance.value());
    }

}
