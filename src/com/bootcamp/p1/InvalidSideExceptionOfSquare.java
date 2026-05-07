package com.bootcamp.p1;

public class InvalidSideExceptionOfSquare extends InvalidSideException {
    public InvalidSideExceptionOfSquare() {
        super("Side must be greater than zero");
    }
}
