package com.tw.bootcamp.p4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ParkingLotTest {
    @Test
    void parkingAreaShouldTakeSizeAndTellWhenItIsFull() {
        ParkingLot parkingLot = new ParkingLot(5, "p1");
        assertFalse(parkingLot.isFull());
    }

    @Test
    void ShouldBeAbleToAddCar() throws NotEnoughSpaceInParkingException {
        ParkingLot parkingLot = new ParkingLot(2, "p1");
        Car car1 = new Car();

        int location1 = parkingLot.park(car1);
        assertFalse(parkingLot.isFull());

        Car car2 = new Car();
        int location2 = parkingLot.park(car2);
        assertTrue(parkingLot.isFull());
    }

    @Test
    void parkingCarInAFullParkingShouldThrow() throws NotEnoughSpaceInParkingException {
        ParkingLot parkingLot = new ParkingLot(2, "p1");
        Car car1 = new Car();
        Car car2 = new Car();

        parkingLot.park(car1);
        parkingLot.park(car2);

        Car car3 = new Car();
        assertThrows(NotEnoughSpaceInParkingException.class, () -> parkingLot.park(car3));
    }
}
