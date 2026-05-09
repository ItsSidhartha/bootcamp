package com.tw.bootcamp.p4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ParkingLotRepositoryTest {
    @Test
    void parkingRepositoryShouldBeAbleToAddNewParkingLot() {
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        assertTrue(parkingLotRepository.add(new ParkingLot(5, "p1")));
    }

    @Test
    void parkingRepositoryShouldBeAbleToCheckIfASpecificParkingLotGetOccupancyRatio() {
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        ParkingLot parkingLot1 = mock(ParkingLot.class);
        ParkingLot parkingLot2 = mock(ParkingLot.class);

        when(parkingLot1.getId()).thenReturn("p1");
        when(parkingLot2.getId()).thenReturn("p2");

        when(parkingLot1.getOccupancyRatio()).thenReturn(1.0);
        when(parkingLot2.getOccupancyRatio()).thenReturn(0.5);

        parkingLotRepository.add(parkingLot1);
        parkingLotRepository.add(parkingLot2);

        assertEquals(1, parkingLotRepository.getOccupancyRatio(parkingLot1.getId()));
        assertTrue(parkingLotRepository.getOccupancyRatio(parkingLot2.getId()) < 1);
    }

    @Test
    void parkingRepositoryShouldBeAbleToCheckIfASpecificParkingLotIsAlmostFull() {
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        ParkingLot parkingLot1 = mock(ParkingLot.class);
        ParkingLot parkingLot2 = mock(ParkingLot.class);

        when(parkingLot1.getId()).thenReturn("p1");
        when(parkingLot2.getId()).thenReturn("p2");

        when(parkingLot1.getOccupancyRatio()).thenReturn(0.9);
        when(parkingLot2.getOccupancyRatio()).thenReturn(0.2);

        parkingLotRepository.add(parkingLot1);
        parkingLotRepository.add(parkingLot2);

        assertTrue(parkingLotRepository.getOccupancyRatio(parkingLot1.getId()) >= 0.8);
        assertTrue(parkingLotRepository.getOccupancyRatio(parkingLot2.getId()) < 0.8);
    }
}
