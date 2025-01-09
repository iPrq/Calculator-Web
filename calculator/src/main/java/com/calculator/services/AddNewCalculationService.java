package com.calculator.services;

import com.calculator.model.Calculation;
import com.calculator.model.CalculatorDTO;
import com.calculator.model.TaskRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AddNewCalculationService implements Command<Calculation,ResponseEntity<CalculatorDTO>> {
    public final TaskRepository taskRepository;

    public AddNewCalculationService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public ResponseEntity<CalculatorDTO> execute(Calculation input) {
        taskRepository.save(input);
        return ResponseEntity.status(HttpStatus.CREATED).body(new CalculatorDTO(input.getMethod(),input.getOutput()));
    }
}
