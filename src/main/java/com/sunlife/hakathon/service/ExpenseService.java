package com.sunlife.hakathon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunlife.hakathon.model.Expense;
import com.sunlife.hakathon.repository.ExpenseRepository;

@Service
public class ExpenseService {

	@Autowired
	private ExpenseRepository expenseRepository;

	public List<Expense> getAllExpenses() {
		return expenseRepository.findAll();
	}

	public Expense getExpenseById(Long id) {
		return expenseRepository.findById(id).orElse(null);
	}

	public Expense saveExpense(Expense expense) {
		return expenseRepository.save(expense);
	}

	public void deleteExpense(Long id) {
		expenseRepository.deleteById(id);
	}
}
