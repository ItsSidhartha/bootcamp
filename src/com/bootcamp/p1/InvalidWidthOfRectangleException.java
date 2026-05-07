package com.bootcamp.p1;

public class InvalidWidthOfRectangleException extends InvalidSideException {
    public InvalidWidthOfRectangleException() {
        super("Width must be greater than zero");
    }
}
