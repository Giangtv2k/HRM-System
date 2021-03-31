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
@Table(name = "STAFFS")
public class Staff implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "staff_id")
	private String staffId;
	
	@Column(name = "s_Name")
	private String staffname;
	
	@Column(name = "s_gender")
	private String gender;
	
	@Column(name = "s_BOD")
	private Date bod;
	
	@Column(name = "s_address")
	private String address;
	
	@Column(name = "s_office")
	private String office;
	
	@Column(name = "s_department")
	private String department;
	
	@Column(name = "s_phone")
	private String phone;
	
	@Column(name = "s_startDate")
	private Date sDate;
	
	

	public Staff() {
		super();
	}



	public Staff(Long id, String staffId, String staffname, String gender, Date bod, String address, String office,
			String department, String phone, Date sDate) {
		super();
		this.id = id;
		this.staffId = staffId;
		this.staffname = staffname;
		this.gender = gender;
		this.bod = bod;
		this.address = address;
		this.office = office;
		this.department = department;
		this.phone = phone;
		this.sDate = sDate;
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



	public String getStaffname() {
		return staffname;
	}



	public void setStaffname(String staffname) {
		this.staffname = staffname;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public Date getBod() {
		return bod;
	}



	public void setBod(Date bod) {
		this.bod = bod;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getOffice() {
		return office;
	}



	public void setOffice(String office) {
		this.office = office;
	}



	public String getDepartment() {
		return department;
	}



	public void setDepartment(String department) {
		this.department = department;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	public Date getsDate() {
		return sDate;
	}



	public void setsDate(Date sDate) {
		this.sDate = sDate;
	}

	
}
