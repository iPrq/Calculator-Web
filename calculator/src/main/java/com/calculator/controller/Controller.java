package com.calculator.controller;

import com.calculator.model.Calculation;
import com.calculator.model.CalculatorDTO;
import com.calculator.services.AddNewCalculationService;
import com.calculator.services.GetCalculationsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/calculator")
public class Controller {
    public final AddNewCalculationService addNewCalculationService;
    public final GetCalculationsService getCalculationsService;

    public Controller(AddNewCalculationService addNewCalculationService, GetCalculationsService getCalculationsService) {
        this.addNewCalculationService = addNewCalculationService;
        this.getCalculationsService = getCalculationsService;
    }

    @PostMapping("/add")
    public ResponseEntity<CalculatorDTO> addCalculation(@RequestBody Calculation calculation) {
        return addNewCalculationService.execute(calculation);
    }

    @GetMapping("/get")
    public ResponseEntity<List<Calculation>> getCalculations() {
        return getCalculationsService.execute(null);
    }
}
