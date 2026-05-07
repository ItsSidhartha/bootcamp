package com.tw.bootcamp.p2;

import java.util.Objects;

public final class Chance {
    private final double value;

    private Chance(double value) {
        this.value = value;
    }

    public static Chance create(double value) throws InvalidProbabilityException {
        if(value <  0 || value> 1) throw new InvalidProbabilityException();
        return new Chance(value);
    }

    public Chance not() throws InvalidProbabilityException {
        return create(1 - value);
    }

    public Chance and(Chance other) throws InvalidProbabilityException {
        return create(value * other.value);
    }

    public Chance or(Chance other) throws InvalidProbabilityException {
        return create(value + other.value - this.and(other).value);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Chance) obj;
        return Math.abs(Double.doubleToLongBits(this.value) - Double.doubleToLongBits(that.value)) <= 0.00001;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

}
