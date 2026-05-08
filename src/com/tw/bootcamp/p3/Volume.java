package com.tw.bootcamp.p3;

public class Volume extends  Measurement{
    public Volume(VolumeUnit unit, double value) {
        super(unit, value);
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Volume)) return false;
        return super.equals(o);
    }
}
