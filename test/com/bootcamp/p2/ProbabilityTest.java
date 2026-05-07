package com.bootcamp.p2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProbabilityTest {
    @Test
    void calculateProbabilityShouldReturnTheProbability() {
        assertEquals(0.5, Probability.calculatePossibility(2,1));
    }
}
