package com.worker.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.*;

@Entity
@Table(name="tb_worker")
public class Worker implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private double dailyInncome;	
	
	public Worker() {
		
	}
	
	public Worker(Long id, String name, double dailyInncome) {
		super();
		this.id = id;
		this.name = name;
		this.dailyInncome = dailyInncome;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getDailyInncome() {
		return dailyInncome;
	}
	public void setDailyInncome(double dailyInncome) {
		this.dailyInncome = dailyInncome;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Worker other = (Worker) obj;
		return Objects.equals(id, other.id);
	}
	
}
