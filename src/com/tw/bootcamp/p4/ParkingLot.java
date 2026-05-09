package com.tw.bootcamp.p4;

import java.util.ArrayList;

public class ParkingLot {
    private final int capacity;
    private final ArrayList<Car> cars;
    private final String id;

    public ParkingLot(int capacity, String id) {
        this.capacity = capacity;
        this.cars = new ArrayList<>(capacity);
        this.id = id;
    }

    public boolean isFull() {
        return this.cars.size() == capacity;
    }

    public int park(Car car) throws NotEnoughSpaceInParkingException {
        if(isFull()) throw new NotEnoughSpaceInParkingException();
        cars.add(car);
        return cars.indexOf(car);
    }

    public String getId() {
        return id;
    }
}
