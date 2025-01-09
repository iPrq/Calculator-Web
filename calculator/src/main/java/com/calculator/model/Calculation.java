package com.calculator.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
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

}
