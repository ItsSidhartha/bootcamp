package com.tw.bootcamp.p1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RectangleTest {
    @Test
    void areaOfRectOf2X3ShouldBe6() throws InvalidSideException {
        Rectangle rectangle = Rectangle.createRectangle(2, 3);
        assertEquals(6, rectangle.area());
    }

    @Test
    void rectangleOfSameHeightAndWidthShouldBeEqual() throws InvalidSideException {
        Rectangle r1 = Rectangle.createRectangle(2, 3);
        Rectangle r2 = Rectangle.createRectangle(2, 3);
        assertEquals(r1, r2);
    }

    @Test
    void parameterOfRectangleOf2X3ShouldBe10() throws InvalidSideException {
        Rectangle rectangle = Rectangle.createRectangle(2, 3);
        assertEquals(10, rectangle.parameter());
    }

    @Test
    void createRectangleShouldThrowIfCalledWithLessThanZeroLength() {
        assertThrows(InvalidLengthOfRectangleException.class, () -> Rectangle.createRectangle(-2, 2));
    }

    @Test
    void createRectangleShouldThrowIfCalledWithLessThanZeroWidth() {
        assertThrows(InvalidWidthOfRectangleException.class, () -> Rectangle.createRectangle(2, -2));
    }
}