package com.sunlife.hakathon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunlife.hakathon.model.Goal;

public interface GoalRepository extends JpaRepository<Goal, Long> {

}
