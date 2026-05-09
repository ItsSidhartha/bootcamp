package com.tw.bootcamp.p5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BagTest {
    @Test
    void ShouldBeAbleToAddBallAtATime() throws NotEnoughSpaceInBagException {
        Bag bag = new Bag();
        assertTrue(bag.addBall(new Ball(BallColors.RED)));
    }

    @Test
    void addShouldThrowExceptionIfBagIsFull() throws NotEnoughSpaceInBagException {
        Bag bag = new Bag();
        for (int i = 0; i < 12; i++) {
            bag.addBall(new Ball(BallColors.BLUE));
        }

        assertThrows(NotEnoughSpaceInBagException.class, () -> bag.addBall(new Ball(BallColors.YELLOW)));
    }
}
