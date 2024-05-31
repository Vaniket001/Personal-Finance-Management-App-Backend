package com.sunlife.hakathon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunlife.hakathon.model.Budget;

public interface BudgetRepository extends JpaRepository<Budget, Long> {

}
