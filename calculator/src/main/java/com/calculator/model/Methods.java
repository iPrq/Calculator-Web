package com.calculator.model;

import lombok.Getter;


public enum Methods {
    ADDITION("add"),
    SUBTRACTION("sub"),
    MULTIPLICATION("mul"),
    DIVISION("div");

    private final String method;

    Methods(String method) {
        this.method = method;
    }

    public String getMethod() {
        return method;
    }

    public static boolean methodValidator(String method) {
        for (Methods m: Methods.values()) {
            if(m.getMethod().equals(method)) {
                return true;
            }
        }
        return false;
    }
}
