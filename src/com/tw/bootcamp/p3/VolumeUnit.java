package com.tw.bootcamp.p3;

public enum VolumeUnit implements Units{
    GALLON(3.78),
    LITER(1);

    private final double factor;

    VolumeUnit(double factor) {
        this.factor = factor;
    }

    public double toBase(double value) {
        return value * factor;
    }
}
