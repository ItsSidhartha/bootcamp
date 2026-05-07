package com.tw.bootcamp.p2;

import java.util.Objects;

public final class Chance {
    private final double value;

    public Chance(double value) {
        this.value = value;
    }

    public Chance not() {
        return new Chance(1 - value);
    }

    public Chance and(Chance other) {
        return new Chance(value * other.value);
    }

    public Chance or(Chance other) {
        return new Chance(value + other.value - this.and(other).value);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Chance) obj;
        return Double.doubleToLongBits(this.value) == Double.doubleToLongBits(that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

}
