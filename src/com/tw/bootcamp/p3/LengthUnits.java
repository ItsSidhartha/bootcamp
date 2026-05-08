package com.tw.bootcamp.p3;

public enum LengthUnits implements Units{
    INCH(2.5),
    FEET(30),
    CM(1),
    MM(0.1);

    private final double factor;

    LengthUnits(double factor){
        this.factor = factor;
    }

    public double toBase(double value) {
        return value * factor;
    }
}
