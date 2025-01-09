package com.calculator.model;

import lombok.Data;

@Data
public class CalculatorDTO {

    public CalculatorDTO(String method, Double output) {
        this.method = method;
        this.output = output;
    }

    public String method;
    public Double output;
}
