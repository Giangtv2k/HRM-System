package com.fu.cs1404.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SALRIES")
public class Salary  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "staff_id", nullable = false)
	private String staffId;
	
	@Column(name = "sa_month", nullable = false)
	private String month;
	
	@Column(name = "sum_work_time", nullable = false)
	private String sWorkTime;
	
	@Column(name = "heso", nullable = false)
	private String heso;
	
	@Column(name = "bonus", nullable = false)
	private String bonus;
	
	@Column(name = "sum_salary", nullable = false)
	private String sSalary;
	
	

	public Salary() {
		super();
	}

	public Salary(Long id, String staff, String month, String sWorkTime, String heso, String bonus, String sSalary) {
		super();
		this.id = id;
		this.staffId = staff;
		this.month = month;
		this.sWorkTime = sWorkTime;
		this.heso = heso;
		this.bonus = bonus;
		this.sSalary = sSalary;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStaffId() {
		return staffId;
	}

	public void setStaffId(String staff) {
		this.staffId = staff;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getsWorkTime() {
		return sWorkTime;
	}

	public void setsWorkTime(String sWorkTime) {
		this.sWorkTime = sWorkTime;
	}

	public String getHeso() {
		return heso;
	}

	public void setHeso(String heso) {
		this.heso = heso;
	}

	public String getBonus() {
		return bonus;
	}

	public void setBonus(String bonus) {
		this.bonus = bonus;
	}

	public String getsSalary() {
		return sSalary;
	}

	public void setsSalary(String sSalary) {
		this.sSalary = sSalary;
	}
	
	
	
}
