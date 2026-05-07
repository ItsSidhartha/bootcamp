package com.bootcamp.p2;

public record Chance(double value) {
    public Chance not() {
        return new Chance( 1 - value());
    }
}
