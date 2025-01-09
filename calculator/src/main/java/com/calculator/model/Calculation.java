package com.calculator.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;

@Entity
@Table(name = "calculation")
public class Calculation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    public Integer id;

    @Column(name="number1")
    public Double number1;

    @Column(name="number2")
    public Double number2;

    @Column(name="method")
    public String method;

    @Column(name="output")
    public Double output;

    public Integer getId() {
        return id;
    }

    public Double getNumber1() {
        return number1;
    }

    public Double getNumber2() {
        return number2;
    }

    public String getMethod() {
        return method;
    }

    public Double getOutput() {
        return output;
    }
}
