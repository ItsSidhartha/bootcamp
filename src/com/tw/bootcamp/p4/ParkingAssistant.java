package com.tw.bootcamp.p4;

public class ParkingAssistant {
    private final ParkingLotRepository parkingLotRepository;

    public ParkingAssistant(ParkingLotRepository parkingLotRepository) {
        this.parkingLotRepository = parkingLotRepository;
    }

    public String display() {
        return parkingLotRepository.parkingLotsState();
    }
}
