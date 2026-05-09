package com.tw.bootcamp.p5;

public class NotEnoughSpaceInBagException extends Throwable {

    public NotEnoughSpaceInBagException() {
        super("Maximum Limit of 12 balls in a bag reached");
    }
}
