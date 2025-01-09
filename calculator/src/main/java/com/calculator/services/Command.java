package com.calculator.services;

public interface Command <I,O>{
    public O execute(I input);
}
