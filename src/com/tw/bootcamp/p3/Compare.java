package com.tw.bootcamp.p3;

public class Compare {
    private final LengthUnit unit;

    public Compare(LengthUnit unit) {
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof LengthUnit other)) return false;
        return unit.toBase().equals(other.toBase());
    }
}