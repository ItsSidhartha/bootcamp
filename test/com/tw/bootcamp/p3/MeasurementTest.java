package com.tw.bootcamp.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MeasurementTest {
    @Test
    void oneFeetShouldBeEqualsToTwelveInches() {
        Length twelveInches = new Length(LengthUnits.INCH, 12);
        Length oneFeet = new Length(LengthUnits.FEET, 1);
        assertEquals(oneFeet, twelveInches);
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

    @Test
    void oneGallonShouldBeEqualsToThreePointSevenEightLiters() {
        Volume oneGallon = new Volume(VolumeUnit.GALLON, 1);
        Volume threePointSevenEightLiters = new Volume(VolumeUnit.LITER, 3.78);

        assertEquals(oneGallon, threePointSevenEightLiters);
    }

    @Test
    void oneLiterShouldNotBeEqualsToOneCm() {
        Volume oneLiter = new Volume(VolumeUnit.LITER, 1);
        Length oneCM = new Length(LengthUnits.CM, 1);

        assertNotEquals(oneLiter, oneCM);
    }

    @Test
    void additionOfTwoInchAndTwoInchShouldBeFourInch() {
        Length twoInch = new Length(LengthUnits.INCH, 2);
        Length fourInch = new Length(LengthUnits.INCH, 4);

        assertEquals(fourInch, twoInch.add(twoInch));
    }
}
