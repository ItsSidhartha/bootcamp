package com.tw.bootcamp.p4;

public class NotEnoughSpaceInParkingException extends Throwable {
    public NotEnoughSpaceInParkingException() {
        super("Parking is full");
    }
}
