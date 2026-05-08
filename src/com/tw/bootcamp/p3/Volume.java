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

    public Volume add(Volume other) {
        if(this.unit == other.unit) {
            return new Volume((VolumeUnit) this.unit, this.value + other.value);
        }

        double sum = this.unit.toBase(this.value) + other.unit.toBase(other.value);
        return new Volume(VolumeUnit.LITER, sum);
    }
}
