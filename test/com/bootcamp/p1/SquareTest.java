package com.bootcamp.p1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SquareTest {
    @Test
    void twoSquareWithSameSideShouldBeEqual() {
        Square s1 = new Square(2);
        Square s2 = new Square(2);
        assertEquals(s2, s1);
    }

    @Test
    void areaOfASquareOfSide3ShouldBeNine() {
        Square square = new Square(3);
        assertEquals(9, square.area());
    }

    @Test
    void parameterOfSquareOfSide3SouldBe12() {
        Square square = new Square(3);
        assertEquals(12, square.parameter());
    }
}
