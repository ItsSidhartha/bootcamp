package com.tw.bootcamp.p4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CarTest {
    @Test
    void twoInstanceOfCarsCannotBeEqual() {
        Car car1 = new Car();
        Car car2 = new Car();
        assertNotEquals(car2, car1);
    }
}
