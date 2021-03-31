package com.fu.cs1404.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BONUSES")
public class Bonus  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "staff_id", nullable = false)
	private String staffId;
	
	@Column(name = "b_date", nullable = false)
	private Date bDate;
	
	@Column(name = "b_type", nullable = false)
	private String bType;
	
	@Column(name = "content", nullable = false)
	private String content;
	
	@Column(name = "b_money", nullable = false)
	private String bMoney;
	
	

	public Bonus() {
		super();
	}

	public Bonus(Long id, String staffId, Date bDate, String bType, String content, String bMoney) {
		super();
		this.id = id;
		this.staffId = staffId;
		this.bDate = bDate;
		this.bType = bType;
		this.content = content;
		this.bMoney = bMoney;
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

	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}

	public Date getbDate() {
		return bDate;
	}

	public void setbDate(Date bDate) {
		this.bDate = bDate;
	}

	public String getbType() {
		return bType;
	}

	public void setbType(String bType) {
		this.bType = bType;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getbMoney() {
		return bMoney;
	}

	public void setbMoney(String bMoney) {
		this.bMoney = bMoney;
	}
	
	
	
}
