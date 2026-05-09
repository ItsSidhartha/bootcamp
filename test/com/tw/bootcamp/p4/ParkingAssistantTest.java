package com.tw.bootcamp.p4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ParkingAssistantTest {
    @Test
    void parkingAssistantShouldReturnDetailsAboutAllParkingLots() {
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        ParkingLot parkingLot1 = mock(ParkingLot.class);
        ParkingLot parkingLot2 = mock(ParkingLot.class);

        when(parkingLot1.getId()).thenReturn("p1");
        when(parkingLot2.getId()).thenReturn("p2");

        when(parkingLot1.getOccupancyRatio()).thenReturn(0.2);
        when(parkingLot2.getOccupancyRatio()).thenReturn(1.0);

        parkingLotRepository.add(parkingLot1);
        parkingLotRepository.add(parkingLot2);

        ParkingAssistant parkingAssistant = new ParkingAssistant(parkingLotRepository);
        assertEquals("""
                p1 -> Space Available
                p2 -> Full
                """, parkingAssistant.display());
    }
}
