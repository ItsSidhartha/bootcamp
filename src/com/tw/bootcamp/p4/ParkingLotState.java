package com.tw.bootcamp.p4;

import java.util.Objects;

public class ParkingLotState {
    private final String id;
    private final int capacity;
    private final int occupied;

    public ParkingLotState(String id, int capacity, int occupied) {
        this.id = id;
        this.capacity = capacity;
        this.occupied = occupied;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ParkingLotState that)) return false;
        return capacity == that.capacity && occupied == that.occupied && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, capacity, occupied);
    }
}
