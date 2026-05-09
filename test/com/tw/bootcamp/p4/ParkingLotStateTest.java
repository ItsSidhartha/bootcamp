package com.tw.bootcamp.p4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParkingLotStateTest {
    @Test
    void parkingLotStateWithSameDataShouldBeEqual() {
        ParkingLotState p1 = new ParkingLotState("p1", 5, 2);
        ParkingLotState p2 = new ParkingLotState("p1", 5, 2);
        assertEquals(p1,p2);
    }
}
