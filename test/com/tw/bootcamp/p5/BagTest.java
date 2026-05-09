package com.tw.bootcamp.p5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BagTest {
    @Test
    void ShouldBeAbleToAddBallAtATime() {
        MyValidator myValidator = new MyValidator();
        Bag bag = new Bag(myValidator);
        assertTrue(bag.addBall(new Ball(BallColors.GREEN)));
    }

    @Test
    void shouldBeAbleToLimitCountOfGreenColorBall() {
        MyValidator myValidator = new MyValidator();
        Bag bag = new Bag(myValidator);
        bag.addBall(new Ball(BallColors.GREEN));
        bag.addBall(new Ball(BallColors.GREEN));

        boolean b3 = bag.addBall(new Ball(BallColors.GREEN));
        assertTrue(b3);
        boolean b4 = bag.addBall(new Ball(BallColors.GREEN));
        assertFalse(b4);
    }

    @Test
    void shouldBeAbleToLimitCountOfRedColorBall() {

        MyValidator myValidator = new MyValidator();
        Bag bag = new Bag(myValidator);
        bag.addBall(new Ball(BallColors.GREEN));
        bag.addBall(new Ball(BallColors.RED));
        boolean b3 = bag.addBall(new Ball(BallColors.RED));

        assertTrue(b3);
        boolean b4 = bag.addBall(new Ball(BallColors.RED));
        assertFalse(b4);
    }

    @Test
    void shouldBeAbleToLimitCountOfYellowColorBall() {
        MyValidator myValidator = new MyValidator();
        Bag bag = new Bag(myValidator);
        bag.addBall(new Ball(BallColors.GREEN));
        bag.addBall(new Ball(BallColors.GREEN));
        bag.addBall(new Ball(BallColors.RED));
        bag.addBall(new Ball(BallColors.RED));

        boolean b5 = bag.addBall(new Ball(BallColors.YELLOW));
        assertTrue(b5);

        bag.addBall(new Ball(BallColors.YELLOW));
        bag.addBall(new Ball(BallColors.YELLOW));

        boolean b8 = bag.addBall(new Ball(BallColors.YELLOW));
        assertFalse(b8);
    }

    @Test
    void summaryShouldReturnTheContentOfBagAtThatTime() {
        MyValidator myValidator = new MyValidator();
        Bag bag = new Bag(myValidator);
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
                YELLOW : 2
                BLUE : 3
                GREEN : 2
                RED : 2
                Total : 9""", bag.summary());

    }
}
