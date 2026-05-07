package com.bootcamp.p1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RectangleTest {
    @Test
    void areaOfRectOf2X3ShouldBe6() {
        Rectangle rectangle = new Rectangle(2, 3);
        assertEquals(6, rectangle.area());
    }

    @Test
    void rectangleOfSameHeightAndWidthShouldBeEqual() {
        Rectangle r1 = new Rectangle(2, 3);
        Rectangle r2 = new Rectangle(2, 3);
        assertTrue(r1.equals(r2));
    }
}