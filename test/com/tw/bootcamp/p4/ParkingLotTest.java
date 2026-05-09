package com.tw.bootcamp.p4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ParkingLotTest {
    @Test
    void parkingAreaShouldTakeSizeAndTellWhenItIsFull() {
        ParkingLot parkingLot = new ParkingLot(5, "p1");
        double occupancyRatio = parkingLot.getOccupancyRatio();
        assertEquals(0, occupancyRatio);
    }

    @Test
    void ShouldBeAbleToAddCar() throws NotEnoughSpaceInParkingException {
        ParkingLot parkingLot = new ParkingLot(2, "p1");
        assertTrue(parkingLot.getOccupancyRatio() < 1);
        parkingLot.park(new Car());
        assertEquals(0.5, parkingLot.getOccupancyRatio());
    }

    @Test
    void parkingCarInAFullParkingShouldThrow() throws NotEnoughSpaceInParkingException {
        ParkingLot parkingLot = new ParkingLot(2, "p1");
        parkingLot.park(new Car());
        parkingLot.park(new Car());

        Car car3 = new Car();
        assertThrows(NotEnoughSpaceInParkingException.class, () -> parkingLot.park(car3));
    }

    @Test
    void isAlmostFullShouldReturnTrueIfEightyPercentOfTheLotIsFull() throws NotEnoughSpaceInParkingException {
        ParkingLot parkingLot = new ParkingLot(5, "p1");
        parkingLot.park(new Car());
        parkingLot.park(new Car());
        assertTrue(parkingLot.getOccupancyRatio() < 0.8);
        parkingLot.park(new Car());
        parkingLot.park(new Car());
        assertTrue(parkingLot.getOccupancyRatio() >= 0.8);
    }
}
