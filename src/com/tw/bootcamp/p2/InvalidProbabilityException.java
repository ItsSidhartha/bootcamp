package com.tw.bootcamp.p2;

public class InvalidProbabilityException extends Throwable {
    public InvalidProbabilityException() {
        super("Probability can only be between 0 and 1");
    }
}
