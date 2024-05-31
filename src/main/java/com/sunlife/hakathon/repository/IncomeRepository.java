package com.sunlife.hakathon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunlife.hakathon.model.Income;

public interface IncomeRepository extends JpaRepository<Income, Long> {

}
