package com.calculator;

import com.calculator.model.Methods;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MethodsMethodValidatorTest {

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void given_input_method_when_Methods_method_Validator_then_return_true() {
        //given
        String method = "add";

        boolean response = Methods.methodValidator(method);
        System.out.println(response);
        assertTrue(response);

    }
}