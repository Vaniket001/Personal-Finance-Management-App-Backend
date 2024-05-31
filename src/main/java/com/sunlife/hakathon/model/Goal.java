package com.sunlife.hakathon.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Goal {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private String goalName;
    private Double targetAmount;
    private Double currentAmount;
    private Date targetDate;
    private String description;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getGoalName() {
		return goalName;
	}
	public void setGoalName(String goalName) {
		this.goalName = goalName;
	}
	public Double getTargetAmount() {
		return targetAmount;
	}
	public void setTargetAmount(Double targetAmount) {
		this.targetAmount = targetAmount;
	}
	public Double getCurrentAmount() {
		return currentAmount;
	}
	public void setCurrentAmount(Double currentAmount) {
		this.currentAmount = currentAmount;
	}
	public Date getTargetDate() {
		return targetDate;
	}
	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
    
    

}
