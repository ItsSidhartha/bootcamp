package com.tw.bootcamp.p3;

public class Length extends Measurement{
    public Length(LengthUnits unit, double value) {
        super(unit, value);
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Length)) return false;
        return super.equals(o);
    }

    public Length add(Length other) {
        if(this.unit == other.unit) {
            return new Length((LengthUnits) this.unit, this.value + other.value);
        }

        double sum = this.unit.toBase(this.value) + other.unit.toBase(other.value);
        return new Length(LengthUnits.INCH, sum);
    }
}
