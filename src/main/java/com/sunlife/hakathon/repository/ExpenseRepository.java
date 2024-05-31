package com.sunlife.hakathon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunlife.hakathon.model.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {

}
