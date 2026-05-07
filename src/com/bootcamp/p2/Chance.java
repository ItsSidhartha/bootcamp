package com.bootcamp.p2;

import java.util.Objects;

public class Chance {
    private final double totalPossibilities;
    private final double favorablePossibilities;

    public Chance(double totalPossibilities, double favorablePossibilities) {
        this.totalPossibilities = totalPossibilities;
        this.favorablePossibilities = favorablePossibilities;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Chance chance)) return false;
        return Double.compare(totalPossibilities, chance.totalPossibilities) == 0 && Double.compare(favorablePossibilities, chance.favorablePossibilities) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalPossibilities, favorablePossibilities);
    }


    public double value() {
        return favorablePossibilities / totalPossibilities;
    }
}
