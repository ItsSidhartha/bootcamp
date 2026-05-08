package com.tw.bootcamp.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CentimeterTest {
    @Test
    void feetWithSameValueShouldBeEqual() {
        Centimeter cm1 = new Centimeter(1);
        Centimeter cm2 = new Centimeter(1);
        assertEquals(cm2, cm1);
    }

    @Test
    void toBaseShouldReturnBaseEquivalent() {
        Centimeter cm1 = new Centimeter(2.5);
        BaseLength base = cm1.toBase();
        assertEquals(new BaseLength(1), base);
    }

    @Test
    void oneFeetShouldBeEqualsTo12Inches() {
        Centimeter fiveCm = new Centimeter(5);
        Inch twoInch = new Inch(2);
        assertEquals(fiveCm, twoInch);
    }

}
