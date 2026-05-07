package com.bootcamp.p1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SquareTest {
    @Test
    void twoSquareWithSameSideShouldBeEqual() {
        Rectangle square1 = Rectangle.createSquare(2);
        Rectangle square2 = Rectangle.createSquare(2);

        assertEquals(square1,square2);
    }

    @Test
    void areaOfASquareOfSide3ShouldBeNine() {
        Rectangle square = Rectangle.createSquare(3);
        assertEquals(9, square.area());
    }

    @Test
    void parameterOfSquareOfSide3ShouldBe12() {
        Rectangle square = Rectangle.createSquare(3);
        assertEquals(12, square.parameter());
    }
}
