package com.tw.bootcamp.p3;

import java.util.Objects;

public class Inch implements LengthUnit{
    private final double value;
    private final Compare compare = new Compare(this);

    public Inch(double value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
     return compare.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }

    public BaseLength toBase() {
        return new BaseLength(value);
    }
}

