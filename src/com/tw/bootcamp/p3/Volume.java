package com.tw.bootcamp.p3;

public class Volume extends  Measurement{
    private Volume(VolumeUnit unit, double value) {
        super(unit, value);
    }

    public static Volume create(VolumeUnit unit, double value) throws InvalidValueException {
        if (value <= 0) throw new InvalidValueException();

        return new Volume(unit, value);
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Volume)) return false;
        return super.equals(o);
    }

    public Volume add(Volume other) throws InvalidValueException {
        if(this.unit == other.unit) {
            return create((VolumeUnit) this.unit, this.value + other.value);
        }

        double sum = this.unit.toBase(this.value) + other.unit.toBase(other.value);
        return create(VolumeUnit.LITER, sum);
    }
}
