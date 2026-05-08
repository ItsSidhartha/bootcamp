package com.tw.bootcamp.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LengthTest {
    @Test
    void oneFeetShouldBeEqualsToTwelveInches() {
        Length twelveInches = new Length(LengthUnits.INCH, 12);
        Length oneFeet = new Length(LengthUnits.FEET, 1);
        assertEquals(oneFeet,twelveInches);
    }

    @Test
    void twoInchShouldBeEqualsToFiveCentimeter() {
        Length twoInches = new Length(LengthUnits.INCH, 2);
        Length fiveCm = new Length(LengthUnits.CM, 5);
        assertEquals(twoInches,fiveCm);
    }


    @Test
    void tenMMShouldBeEqualsToOneCentimeter() {
        Length tenMM = new Length(LengthUnits.MM, 10);
        Length oneCm = new Length(LengthUnits.CM, 1);
        assertEquals(tenMM,oneCm);
    }

//    @Test
//    void tenMMShouldBeEqualsToOneCentimeter() {
//        Length tenMM = new Length(Unit.MM, 10);
//        Length oneCm = new Length(Unit.CM, 1);
//        assertEquals(tenMM,oneCm);
//    }


}
