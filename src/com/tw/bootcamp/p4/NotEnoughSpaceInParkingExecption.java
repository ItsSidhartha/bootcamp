package com.tw.bootcamp.p4;

public class NotEnoughSpaceInParkingExecption extends Throwable {
    public NotEnoughSpaceInParkingExecption() {
        super("Parking is full");
    }
}
