package com.peyroll.entities;

import java.io.Serializable;

public class Payment implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	private Double dailyinncome;
	private Integer days;
	
	public Payment() {}
	
	public Payment(String name, Double dailyinncome, Integer days) {
		super();
		this.name = name;
		this.dailyinncome = dailyinncome;
		this.days = days;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getDailyinncome() {
		return dailyinncome;
	}

	public void setDailyinncome(Double dailyinncome) {
		this.dailyinncome = dailyinncome;
	}

	public Integer getDays() {
		return days;
	}

	public void setDays(Integer days) {
		this.days = days;
	}
	
	public double getTotal() {
		return days * dailyinncome;
	}	

}
