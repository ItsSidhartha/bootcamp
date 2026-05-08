package com.tw.bootcamp.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VolumeTest {
    @Test
    void oneGallonShouldBeEqualsToThreePointSevenEightLiters() {
        Volume oneGallon = new Volume(VolumeUnit.GALLON, 1);
        Volume threePointSevenEightLiters = new Volume(VolumeUnit.LITER, 3.78);

        assertEquals(oneGallon, threePointSevenEightLiters);
    }

}
