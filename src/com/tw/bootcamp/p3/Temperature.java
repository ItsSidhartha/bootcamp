package com.tw.bootcamp.p3;

public class Temperature extends Measurement {
    public Temperature(Units unit, double value) {
        super(unit, value);
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Temperature)) return false;
        return super.equals(o);
    }
}
