package com.bootcamp.p2;

public record Chance(double value) {
    public Chance not() {
        return new Chance( 1 - value());
    }

    public Chance and(Chance other) {
        return new Chance(value * other.value);
    }

    public Chance or(Chance other) {
        return new Chance(value + other.value - this.and(other).value);
    }
}
