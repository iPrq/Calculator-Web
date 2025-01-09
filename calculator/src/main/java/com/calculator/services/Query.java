package com.calculator.services;


public interface Query <I,O> {
    public O execute(I input);
}
