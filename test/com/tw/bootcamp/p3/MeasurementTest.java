package com.tw.bootcamp.p3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MeasurementTest {
    @Test
    void oneFeetShouldBeEqualsToTwelveInches() throws InvalidValueException {
        Length twelveInches = Length.create(LengthUnits.INCH, 12);
        Length oneFeet = Length.create(LengthUnits.FEET, 1);

        assertEquals(oneFeet, twelveInches);
    }

    @Test
    void twoInchShouldBeEqualsToFiveCentimeter() throws InvalidValueException {
        Length twoInches = Length.create(LengthUnits.INCH, 2);
        Length fiveCm = Length.create(LengthUnits.CM, 5);

        assertEquals(twoInches,fiveCm);
    }


    @Test
    void tenMMShouldBeEqualsToOneCentimeter() throws InvalidValueException {
        Length tenMM = Length.create(LengthUnits.MM, 10);
        Length oneCm = Length.create(LengthUnits.CM, 1);

        assertEquals(tenMM,oneCm);
    }

    @Test
    void oneGallonShouldBeEqualsToThreePointSevenEightLiters() throws InvalidValueException {
        Volume oneGallon = Volume.create(VolumeUnit.GALLON, 1);
        Volume threePointSevenEightLiters = Volume.create(VolumeUnit.LITER, 3.78);

        assertEquals(oneGallon, threePointSevenEightLiters);
    }

    @Test
    void oneLiterShouldNotBeEqualsToOneCm() throws InvalidValueException {
        Volume oneLiter = Volume.create(VolumeUnit.LITER, 1);
        Length oneCM = Length.create(LengthUnits.CM, 1);

        assertNotEquals(oneLiter, oneCM);
    }

    @Test
    void additionOfTwoInchAndTwoInchShouldBeFourInch() throws InvalidValueException {
        Length twoInch = Length.create(LengthUnits.INCH, 2);
        Length fourInch = Length.create(LengthUnits.INCH, 4);

        assertEquals(fourInch, twoInch.add(twoInch));
    }

    @Test
    void additionOfTwoInchesAndTwoPointFiveCMShouldBeThreeInches() throws InvalidValueException {
        Length twoInches = Length.create(LengthUnits.INCH, 2);
        Length twoPointFiveCM = Length.create(LengthUnits.CM, 2.5);
        Length threeInches = Length.create(LengthUnits.INCH, 3);

        assertEquals(threeInches, twoInches.add(twoPointFiveCM));
    }

    @Test
    void additionOfTwoInchesAndTwoFeetShouldBeTwentySixInches() throws InvalidValueException {
        Length twoInches = Length.create(LengthUnits.INCH, 2);
        Length twoFeet = Length.create(LengthUnits.FEET, 2);
        Length twentySixInches = Length.create(LengthUnits.INCH, 26);

        assertEquals(twentySixInches, twoInches.add(twoFeet));
    }

    @Test
    void additionOfOneGallonAndOneLiterShouldBeFourPointSevenLiters() throws InvalidValueException {
        Volume oneGallon = Volume.create(VolumeUnit.GALLON, 1);
        Volume oneLiter = Volume.create(VolumeUnit.LITER, 1);
        Volume fourPointSevenLiter = Volume.create(VolumeUnit.LITER, 4.78);

        assertEquals(fourPointSevenLiter, oneGallon.add(oneLiter));
    }

    @Test
    void shouldThrowErrorIfGivenValueOfVolumeIsInNegative() {
        assertThrows(InvalidValueException.class, () -> Volume.create(VolumeUnit.LITER, -1));
    }
    
    @Test
    void shouldThrowErrorIfGivenValueOfLengthIsInNegative() {
        assertThrows(InvalidValueException.class, () -> Length.create(LengthUnits.CM, -1));
    }

    @Test
    void twoHundredTwelveFAndOneHundredCShouldBeEqual() {
        Temperature twoHundredTwelveF = new Temperature(TempUnits.F, 212);
        Temperature oneHundredC = new Temperature(TempUnits.C, 100);
        assertEquals(twoHundredTwelveF, oneHundredC);
    }
}
