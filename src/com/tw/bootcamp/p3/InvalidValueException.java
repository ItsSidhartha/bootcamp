package com.tw.bootcamp.p3;

public class InvalidValueException extends Throwable {
    public InvalidValueException() {
        super("value of scaler quantity can't be less than or equals to zero");
    }
}
