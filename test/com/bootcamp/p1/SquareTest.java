package com.bootcamp.p1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SquareTest {
    @Test
    void twoSquareWithSameSideShouldBeEqual() throws InvalidSideException {
        Rectangle square1 = Rectangle.createSquare(2);
        Rectangle square2 = Rectangle.createSquare(2);

        assertEquals(square1,square2);
    }

    @Test
    void areaOfASquareOfSide3ShouldBeNine() throws InvalidSideException {
        Rectangle square = Rectangle.createSquare(3);
        assertEquals(9, square.area());
    }

    @Test
    void parameterOfSquareOfSide3ShouldBe12() throws InvalidSideException {
        Rectangle square = Rectangle.createSquare(3);
        assertEquals(12, square.parameter());
    }

    @Test
    void createSquareShouldThrowIfCalledWithLessThanZero() {
        assertThrows(InvalidSideExceptionOfSquare.class, () -> Rectangle.createSquare(-1));
    }
}
