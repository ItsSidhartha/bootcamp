package com.tw.bootcamp.p2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ChanceTest {
    @Test
    void chanceOfSameTotalPossibilitiesAndFavorableShouldBeEqual() throws InvalidProbabilityException {
        Chance c1 = Chance.create(0.5);
        Chance c2 = Chance.create(0.5);
        assertEquals(c1, c2);
    }

    @Test
    void chanceOfGettingTailsShouldBePoint5() throws InvalidProbabilityException {
        Chance chanceOfGettingTails = Chance.create(0.5);
        assertEquals(Chance.create(0.5), chanceOfGettingTails);
    }

    @Test
    void chanceOfNotGettingTailsShouldBePoint5() throws InvalidProbabilityException {
        Chance chanceOfGettingTails = Chance.create(0.5);
        Chance chanceOfNotGettingTails = chanceOfGettingTails.not();
        assertEquals(Chance.create(0.5), chanceOfNotGettingTails);
    }

    @Test
    void chanceOfGettingTailsWhenTwoCoinsAreFlippedShouldBePoint75() throws InvalidProbabilityException {
        Chance firstCoinChanceOfTails = Chance.create(0.5);
        Chance secondCoinChanceOfTails = Chance.create(0.5);
        Chance chanceOfGettingTailsOnBoth = firstCoinChanceOfTails.and(secondCoinChanceOfTails);
        assertEquals(Chance.create(0.25), chanceOfGettingTailsOnBoth);
    }

    @Test
    void chanceOfGettingAtLeastOneTailsOnFlippingTwoCoins() throws InvalidProbabilityException {
        Chance firstCoinChanceOfTails = Chance.create(0.5);
        Chance secondCoinChanceOfTails = Chance.create(0.5);
        Chance chanceOfGettingTailsOnAtLeastOneCoin = firstCoinChanceOfTails.or(secondCoinChanceOfTails);
        assertEquals(Chance.create(0.75), chanceOfGettingTailsOnAtLeastOneCoin);
    }

    @Test
    void chanceOfGettingTailsInCoinAndThreeInDice() throws InvalidProbabilityException {
        Chance chanceOfTailsInCoin = Chance.create(0.5);
        Chance chanceOfThreeInDice = Chance.create(0.1667);
        Chance chanceOfGettingTailsAndDice = chanceOfThreeInDice.and(chanceOfTailsInCoin);
        assertEquals(Chance.create(0.08335), chanceOfGettingTailsAndDice);
    }

    @Test
    void creatingChanceWithValueMore1ShouldThrow() {
        InvalidProbabilityException exception = assertThrows(InvalidProbabilityException.class, () -> Chance.create(2));
        assertEquals("Probability can only be between 0 and 1", exception.getMessage());
    }
    @Test
    void creatingChanceWithValueLessThan0ShouldThrow() {
        InvalidProbabilityException exception = assertThrows(InvalidProbabilityException.class, () -> Chance.create(-1));
        assertEquals("Probability can only be between 0 and 1", exception.getMessage());
    }
}
