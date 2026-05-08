package com.tw.bootcamp.p4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ParkingAreaTest {
    @Test
    void parkingAreaShouldTakeSizeAndTellWhenItIsFull() {
        ParkingArea parkingArea = new ParkingArea(5);
        assertFalse(parkingArea.isFull());
    }

    @Test
    void ShouldBeAbleToAddCar() throws NotEnoughSpaceInParkingExecption {
        ParkingArea parkingArea = new ParkingArea(2);
        int location1 = parkingArea.park("C1");
        assertFalse(parkingArea.isFull());
        int location2 = parkingArea.park("C2");
        assertTrue(parkingArea.isFull());
    }

    @Test
    void parkingCarInAFullParkingShouldThrow() throws NotEnoughSpaceInParkingExecption {
        ParkingArea parkingArea = new ParkingArea(2);
        parkingArea.park("C1");
        parkingArea.park("C2");
        assertThrows(NotEnoughSpaceInParkingExecption.class, () -> parkingArea.park("C3"));
    }
}
