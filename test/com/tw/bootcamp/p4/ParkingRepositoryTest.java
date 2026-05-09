package com.tw.bootcamp.p4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

public class ParkingRepositoryTest {
    @Test
    void parkingRepositoryShouldBeAbleToAddNewParkingLot() {
        ParkingRepository parkingRepository = new ParkingRepository();
        assertTrue(parkingRepository.add(new ParkingLot(5,"p1")));
    }

    @Test
    void parkingRepositoryShouldBeAbleToCheckIfASpecificParkingLotIsFull() {
        ParkingRepository parkingRepository = new ParkingRepository();
        ParkingLot parkingLot1 = mock(ParkingLot.class);
        ParkingLot parkingLot2 = mock(ParkingLot.class);

        when(parkingLot1.getId()).thenReturn("p1");
        when(parkingLot2.getId()).thenReturn("p2");

        when(parkingLot1.isFull()).thenReturn(true);
        when(parkingLot2.isFull()).thenReturn(false);

        parkingRepository.add(parkingLot1);
        parkingRepository.add(parkingLot2);

        assertTrue(parkingRepository.isFull(parkingLot1.getId()));
        assertFalse(parkingRepository.isFull(parkingLot2.getId()));

    }
}
