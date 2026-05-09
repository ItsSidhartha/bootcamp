package com.tw.bootcamp.p4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class parkingAssistantTest {
    @Test
    void parkingAssistantShouldReturnDetailsAboutAllParkingLots() {
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        ParkingLot parkingLot1 = mock(ParkingLot.class);
        ParkingLot parkingLot2 = mock(ParkingLot.class);

        when(parkingLot1.getId()).thenReturn("p1");
        when(parkingLot2.getId()).thenReturn("p2");

        when(parkingLot1.isFull()).thenReturn(true);
        when(parkingLot2.isFull()).thenReturn(false);

        parkingLotRepository.add(parkingLot1);
        parkingLotRepository.add(parkingLot2);

        ParkingAssistant parkingAssistant = new ParkingAssistant(parkingLotRepository);
        assertEquals("p1 -> Full\n" + "p2 -> Space Available\n", parkingAssistant.display());
    }
}
