package com.tw.bootcamp.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InchTest{
    @Test
    void InchWithSameValueShouldBeEqual() {
        Inch inch1 = new Inch(1);
        Inch inch2 = new Inch(1);
        assertEquals(inch2, inch1);
    }

    @Test
    void toBaseShouldReturnABaseLengthUnit() {
        Inch inch = new Inch(1);
        BaseLength base = inch.toBase();
        assertEquals(new BaseLength(1), base);
    }
}
