package com.tw.bootcamp.p4;

import java.util.ArrayList;

public class ParkingArea {
    private final int capacity;
    private final ArrayList<String> cars;

    public ParkingArea(int capacity) {
        this.capacity = capacity;
        this.cars = new ArrayList<>(capacity);
    }

    public boolean isFull() {
        return this.cars.size() == capacity;
    }

    public int park(String car) throws NotEnoughSpaceInParkingExecption {
        if(isFull()) throw new NotEnoughSpaceInParkingExecption();
        cars.add(car);
        return cars.indexOf(car);
    }
}
