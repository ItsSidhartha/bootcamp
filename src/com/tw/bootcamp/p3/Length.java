package com.tw.bootcamp.p3;

public class Length extends Measurement{
    private Length(LengthUnits unit, double value) {
        super(unit, value);
    }

    public static Length create(LengthUnits unit, double value) throws InvalidValueException {
        if (value <= 0) throw new InvalidValueException();
        return new Length(unit, value);
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Length)) return false;
        return super.equals(o);
    }

    public Length add(Length other) throws InvalidValueException {
        if(this.unit == other.unit) {
            return create((LengthUnits) this.unit, this.value + other.value);
        }

        double sum = this.unit.toBase(this.value) + other.unit.toBase(other.value);
        return create(LengthUnits.INCH, sum);
    }
}
