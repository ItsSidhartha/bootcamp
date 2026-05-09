package com.tw.bootcamp.p4;

import java.util.HashMap;

public class ParkingLotRepository {

    private final HashMap<String, ParkingLot> parkingLots = new HashMap<>();

    public boolean add(ParkingLot parkingLot) {
        this.parkingLots.put(parkingLot.getId(), parkingLot);
        return true;
    }

    public double getOccupancyRatio(String id) {
        ParkingLot parkingLot = parkingLots.get(id);
        return parkingLot.getOccupancyRatio();
    }

    public String parkingLotsState() {
        StringBuilder stringBuilder = new StringBuilder();

        parkingLots.forEach((id, parkingLot)->{
            stringBuilder.append(id).append(" -> ").append(parkingLot.isFull() ? "Full": "Space Available").append("\n");
        });

        return stringBuilder.toString();
    }
}
