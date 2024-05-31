package com.sunlife.hakathon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunlife.hakathon.model.Income;
import com.sunlife.hakathon.service.IncomeService;

@RestController
@RequestMapping("/api/incomes")
public class IncomeController {

	 @Autowired
	    private IncomeService incomeService;

	    @GetMapping
	    public List<Income> getAllIncomes() {
	        return incomeService.getAllIncomes();
	    }

	    @PostMapping
	    public Income createIncome(@RequestBody Income income) {
	        return incomeService.saveIncome(income);
	    }

	    @GetMapping("/{id}")
	    public Income getIncomeById(@PathVariable Long id) {
	        return incomeService.getIncomeById(id);
	    }

	    @PutMapping("/{id}")
	    public Income updateIncome(@PathVariable Long id, @RequestBody Income income) {
	        income.setId(id);
	        return incomeService.saveIncome(income);
	    }

	    @DeleteMapping("/{id}")
	    public void deleteIncome(@PathVariable Long id) {
	        incomeService.deleteIncome(id);
	    }
}
