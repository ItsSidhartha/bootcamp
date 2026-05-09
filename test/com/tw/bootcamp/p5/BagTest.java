package com.tw.bootcamp.p5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BagTest {
    @Test
    void ShouldBeAbleToAddBallAtATime() throws NotEnoughSpaceInBagException {
        Bag bag = new Bag(3);
        assertTrue(bag.addBall(new Ball(BallColors.GREEN)));
    }

    @Test
    void addShouldThrowExceptionIfBagIsFull() throws NotEnoughSpaceInBagException {
        Bag bag = new Bag(3);
        for (int i = 0; i < 12; i++) {
            bag.addBall(new Ball(BallColors.BLUE));
        }

        assertThrows(NotEnoughSpaceInBagException.class, () -> bag.addBall(new Ball(BallColors.YELLOW)));
    }

    @Test
    void shouldBeAbleToLimitCountOfGreenColorBall() throws NotEnoughSpaceInBagException {
        Bag bag = new Bag(3);
        boolean b1 = bag.addBall(new Ball(BallColors.GREEN));
        boolean b2 = bag.addBall(new Ball(BallColors.GREEN));
        boolean b3 = bag.addBall(new Ball(BallColors.GREEN));
        assertTrue(b3);
        boolean b4 = bag.addBall(new Ball(BallColors.GREEN));
        assertFalse(b4);
    }

    @Test
    void shouldBeAbleToLimitCountOfRedColorBall() throws NotEnoughSpaceInBagException {
        Bag bag = new Bag(3);
        boolean b1 = bag.addBall(new Ball(BallColors.GREEN));
        boolean b2 = bag.addBall(new Ball(BallColors.RED));
        boolean b3 = bag.addBall(new Ball(BallColors.RED));
        assertTrue(b3);
        boolean b4 = bag.addBall(new Ball(BallColors.RED));
        assertFalse(b4);
    }

    @Test
    void shouldBeAbleToLimitCountOfYellowColorBall() throws NotEnoughSpaceInBagException {
        Bag bag = new Bag(3);
        boolean b1 = bag.addBall(new Ball(BallColors.GREEN));
        boolean b2 = bag.addBall(new Ball(BallColors.GREEN));
        boolean b3 = bag.addBall(new Ball(BallColors.RED));
        boolean b4 = bag.addBall(new Ball(BallColors.RED));
        boolean b5 = bag.addBall(new Ball(BallColors.YELLOW));
        assertTrue(b5);
        boolean b6 = bag.addBall(new Ball(BallColors.YELLOW));
        boolean b7 = bag.addBall(new Ball(BallColors.YELLOW));
        boolean b8 = bag.addBall(new Ball(BallColors.YELLOW));
        assertFalse(b8);
    }

    @Test
    void summaryShouldReturnTheContentOfBagAtThatTime() throws NotEnoughSpaceInBagException {
        Bag bag = new Bag(3);
        bag.addBall(new Ball(BallColors.GREEN));
        bag.addBall(new Ball(BallColors.GREEN));
        bag.addBall(new Ball(BallColors.RED));
        bag.addBall(new Ball(BallColors.RED));
        bag.addBall(new Ball(BallColors.BLUE));
        bag.addBall(new Ball(BallColors.BLUE));
        bag.addBall(new Ball(BallColors.BLUE));
        bag.addBall(new Ball(BallColors.YELLOW));
        bag.addBall(new Ball(BallColors.YELLOW));

        assertEquals("""
                GREEN : 2
                RED : 2
                BLUE : 3
                YELLOW : 2
                Total : 9""", bag.summary());
    }
}
