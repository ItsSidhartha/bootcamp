package com.tw.bootcamp.p3;

import java.util.Objects;

public class BaseLength {
    private final double value;

    public BaseLength(double value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof BaseLength that)) return false;
        return Double.compare(value, that.value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}
