package com.bootcamp.p1;

import java.util.Objects;

public class Square {
    private final int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Square square)) return false;
        return side == square.side;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(side);
    }

    public double area() {
        return side * side;
    }

    public double parameter() {
        return 4 * side;
    }
}
