package com.sunlife.hakathon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunlife.hakathon.model.Income;
import com.sunlife.hakathon.repository.IncomeRepository;

@Service
public class IncomeService {

	@Autowired
	private IncomeRepository incomeRepository;

	public List<Income> getAllIncomes() {
		return incomeRepository.findAll();
	}

	public Income getIncomeById(Long id) {
		return incomeRepository.findById(id).orElse(null);
	}

	public Income saveIncome(Income income) {
		return incomeRepository.save(income);
	}

	public void deleteIncome(Long id) {
		incomeRepository.deleteById(id);
	}
}
