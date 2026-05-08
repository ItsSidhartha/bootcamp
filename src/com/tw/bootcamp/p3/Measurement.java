package com.tw.bootcamp.p3;

import java.util.Objects;

public abstract class Measurement{
    private final Units unit;
    private final double value;

    public Measurement(Units unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Measurement other)) return false;
        return unit.toBase(value) == other.unit.toBase(other.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(unit, value);
    }
}
