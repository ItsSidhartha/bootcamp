package com.tw.bootcamp.p5;

public class Bag {
    private int occupied;
    private final int capacity = 12;

    public boolean addBall() throws NotEnoughSpaceInBagException {
        if(occupied == capacity) throw new NotEnoughSpaceInBagException();
        occupied++;
        return true;
    }
}
