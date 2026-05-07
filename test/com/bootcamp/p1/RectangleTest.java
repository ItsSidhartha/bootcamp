package com.bootcamp.p1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RectangleTest {
    @Test
    void areaOfRectOf2X3ShouldBe6() {
        Rectangle rectangle = Rectangle.createRectangle(2, 3);
        assertEquals(6, rectangle.area());
    }

    @Test
    void rectangleOfSameHeightAndWidthShouldBeEqual() {
        Rectangle r1 = Rectangle.createRectangle(2, 3);
        Rectangle r2 = Rectangle.createRectangle(2, 3);
        assertEquals(r1, r2);
    }

    @Test
    void parameterOfRectangleOf2X3ShouldBe10() {
        Rectangle rectangle = Rectangle.createRectangle(2, 3);
        assertEquals(10, rectangle.parameter());
    }
}