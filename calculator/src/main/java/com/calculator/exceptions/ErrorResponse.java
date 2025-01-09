package com.calculator.exceptions;

import lombok.Getter;

@Getter
public class ErrorResponse {
    public final String message;

    public ErrorResponse(String message) {
        this.message = message;
    }
}
