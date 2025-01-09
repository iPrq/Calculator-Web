package com.calculator.services;

import com.calculator.model.Calculation;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetCalculationsService implements Query<Void, ResponseEntity<List<Calculation>>> {

    @Override
    public ResponseEntity<List<Calculation>> execute(Void input) {
        return null;
    }
}
