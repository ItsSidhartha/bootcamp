package com.tw.bootcamp.p3;

import java.util.Objects;

public class Volume {
    private final VolumeUnit unit;
    private final double value;

    public Volume(VolumeUnit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Volume other)) return false;
        return unit.toBase(value) == other.unit.toBase(other.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(unit, value);
    }
}
