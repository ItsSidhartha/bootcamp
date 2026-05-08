package com.tw.bootcamp.p3;

import java.util.Objects;

public class Length {
    private final Units lengthUnits;
    private final double value;

    public Length(Units lengthUnits, double value) {
        this.lengthUnits = lengthUnits;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Length length)) return false;
        return lengthUnits.toBase(value) == length.lengthUnits.toBase(length.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lengthUnits, value);
    }
}
