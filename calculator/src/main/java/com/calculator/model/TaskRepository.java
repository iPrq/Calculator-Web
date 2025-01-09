package com.calculator.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Calculation,Integer>  {
}
