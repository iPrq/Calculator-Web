package com.calculator.services;

import com.calculator.model.Calculation;
import com.calculator.model.TaskRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetCalculationsService implements Query<Void, ResponseEntity<List<Calculation>>> {
    private final TaskRepository taskRepository;

    public GetCalculationsService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public ResponseEntity<List<Calculation>> execute(Void input) {
        List<Calculation> calculations = taskRepository.findAll();
        return ResponseEntity.ok(calculations);
    }
}
