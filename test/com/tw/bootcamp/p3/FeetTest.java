package com.tw.bootcamp.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FeetTest {
    @Test
    void feetWithSameValueShouldBeEqual() {
        Feet feet1 =new Feet(1);
        Feet feet2 =new Feet(1);
        assertEquals(feet2, feet1);
    }

    @Test
    void toBaseShouldReturnBaseEquivalent() {
        Feet feet =new Feet(1);
        BaseLength base = feet.toBase();
        assertEquals(new BaseLength(12), base);
    }

    @Test
    void oneFeetShouldBeEqualsTo12Inches() {
        Feet oneFeet =new Feet(1);
        Inch twelveInches = new Inch(12);
        assertEquals(oneFeet, twelveInches);
    }
}
