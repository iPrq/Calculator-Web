package com.calculator.controller;

import com.calculator.model.Calculation;
import com.calculator.model.CalculatorDTO;
import com.calculator.services.AddNewCalculationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class Controller {
    public final AddNewCalculationService addNewCalculationService;

    public Controller(AddNewCalculationService addNewCalculationService) {
        this.addNewCalculationService = addNewCalculationService;
    }

    @PostMapping("/add")
    public ResponseEntity<CalculatorDTO> addCalculation(@RequestBody Calculation calculation) {
        return addNewCalculationService.execute(calculation);
    }

}
