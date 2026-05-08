package com.tw.bootcamp.p3;

public enum LengthUnits implements Units{
    INCH(1),
    FEET(12),
    CM(0.4),
    MM(0.04);

    private final double factor;

    LengthUnits(double factor){
        this.factor = factor;
    }

    public double toBase(double value) {
        return value * factor;
    }
}
