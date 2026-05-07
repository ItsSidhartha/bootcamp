package com.tw.bootcamp.p1;

public class InvalidLengthOfRectangleException extends InvalidSideException {
    public InvalidLengthOfRectangleException() {
        super("Length must be greater than zero");
    }
}
