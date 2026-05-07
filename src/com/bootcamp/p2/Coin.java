package com.bootcamp.p2;

import java.util.List;

public class Coin {
    public static final List<String> POSSIBILITIES = List.of("Heads", "Tails");


    public double chance(String face) {
        double totalPossibilities = POSSIBILITIES.size();
        double favorableOutcomes = POSSIBILITIES.stream().filter(x -> x.equals(face)).toArray().length;

        return Probability.calculatePossibility(totalPossibilities, favorableOutcomes);
    }

    public double chanceOfNotGetting(String face) {
        return 1 - chance(face);
    }
}