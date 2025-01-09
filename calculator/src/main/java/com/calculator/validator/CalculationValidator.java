package com.calculator.validator;

import com.calculator.exceptions.CalculationNotValidException;
import com.calculator.model.Calculation;
import com.calculator.model.Methods;

public class CalculationValidator {

    public static void ValidateNewCalculation(Calculation calculation) {
        if (calculation.getNumber1() == null) {
                throw new CalculationNotValidException("invalid number");
        }
        if (calculation.getNumber2() == null) {
            throw new CalculationNotValidException("invalid number");
        }

        if(!Methods.methodValidator(calculation.getMethod())) {
            throw new CalculationNotValidException("invalid method");
        }

        if(calculation.getOutput() == null) {
            throw new CalculationNotValidException("Invalid output");
        }

    }
}
