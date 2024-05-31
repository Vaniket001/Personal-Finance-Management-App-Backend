package com.sunlife.hakathon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunlife.hakathon.model.Budget;
import com.sunlife.hakathon.repository.BudgetRepository;

@Service
public class BudgetService {
	
	@Autowired
	private BudgetRepository budgetRepository;

	public List<Budget> getAllBudgets() {
		return budgetRepository.findAll();
	}

	public Budget getBudgetById(Long id) {
		return budgetRepository.findById(id).orElse(null);
	}

	public Budget saveBudget(Budget budget) {
		return budgetRepository.save(budget);
	}

	public void deleteBudget(Long id) {
		budgetRepository.deleteById(id);
	}

}
