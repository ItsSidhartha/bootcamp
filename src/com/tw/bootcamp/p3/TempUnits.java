package com.tw.bootcamp.p3;

public enum TempUnits implements Units {
    C, F;

    @Override
    public double toBase(double value) {
        return  switch (this){
            case F -> (value - 32) / 1.8;
            case C -> value;
        };
    }
}
