package com.calculator.model;

import lombok.Data;

public class CalculatorDTO {

    public CalculatorDTO(String method, Double output) {
        this.method = method;
        this.output = output;
    }

    public String method;
    public Double output;

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Double getOutput() {
        return output;
    }

    public void setOutput(Double output) {
        this.output = output;
    }
}
