package com.tw.bootcamp.p4;

import java.util.HashMap;

public class ParkingRepository {

    private final HashMap<String, ParkingLot> parkingLots = new HashMap<>();

    public boolean add(ParkingLot parkingLot) {
        this.parkingLots.put(parkingLot.getId(), parkingLot);
        return true;
    }

    public boolean isFull(String id) {
        ParkingLot parkingLot = parkingLots.get(id);
        return parkingLot.isFull();
    }

}
