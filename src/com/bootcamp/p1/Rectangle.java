package com.bootcamp.p1;

import java.util.Objects;

public class Rectangle {
    private final double length;
    private final double width;

    private Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public static Rectangle createRectangle(double length, double width) throws InvalidSideException {
        if(length <= 0) {
            throw new InvalidLengthOfRectangleException();
        }

        if(width <= 0) {
            throw new InvalidWidthOfRectangleException();
        }

        return new Rectangle(length, width);
    }

    public static Rectangle createSquare(double side) throws InvalidSideException {
        if(side <= 0) {
            throw new InvalidSideExceptionOfSquare();
        }
        return new Rectangle(side, side);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Rectangle rectangle)) return false;
        return Double.compare(length, rectangle.length) == 0 && Double.compare(width, rectangle.width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, width);
    }

    public double area() {
        return length * width;
    }

    public double parameter() {
        return (length + width) * 2;
    }
}
