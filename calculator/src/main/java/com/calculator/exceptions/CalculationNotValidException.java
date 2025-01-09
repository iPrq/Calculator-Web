package com.calculator.exceptions;


public class CalculationNotValidException extends RuntimeException {

    public CalculationNotValidException(String message) {
        super(message);
    }
}
