package com.sunlife.hakathon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunlife.hakathon.model.Goal;
import com.sunlife.hakathon.repository.GoalRepository;

@Service
public class GoalService {

	@Autowired
	private GoalRepository goalRepository;

	public List<Goal> getAllGoals() {
		return goalRepository.findAll();
	}

	public Goal getGoalById(Long id) {
		return goalRepository.findById(id).orElse(null);
	}

	public Goal saveGoal(Goal goal) {
		return goalRepository.save(goal);
	}

	public void deleteGoal(Long id) {
		goalRepository.deleteById(id);
	}
}
