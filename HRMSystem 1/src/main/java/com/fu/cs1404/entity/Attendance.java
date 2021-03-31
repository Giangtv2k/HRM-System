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
@Table(name = "ATTENDANCES")
public class Attendance  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "staff_id")
	private String uId;
	
	//@Column(name = "staff_id")
	private String dmm;
	
	@Column(name = "a_date", nullable = false)
	private Date aDate;
	
	@Column(name = "s_hour", nullable = false)
	private String sHour;
	
	@Column(name = "e_hour", nullable = false)
	private String eHour;
	
	@Column(name = "work_time", nullable = false)
	private String workTime;
	
	

	public Attendance() {
		super();
	}

	public Attendance(Long id, String staff, Date aDate, String sHour, String eHour, String workTime, String dmm) {
		super();
		this.id = id;
		this.uId = staff;
		this.aDate = aDate;
		this.sHour = sHour;
		this.eHour = eHour;
		this.workTime = workTime;
		this.dmm = dmm;
	}
	
	

	public String getuId() {
		return uId;
	}

	public void setuId(String uId) {
		this.uId = uId;
	}

	public String getDmm() {
		return dmm;
	}

	public void setDmm(String dmm) {
		this.dmm = dmm;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getaDate() {
		return aDate;
	}

	public void setaDate(Date aDate) {
		this.aDate = aDate;
	}

	public String getsHour() {
		return sHour;
	}

	public void setsHour(String sHour) {
		this.sHour = sHour;
	}

	public String geteHour() {
		return eHour;
	}

	public void seteHour(String eHour) {
		this.eHour = eHour;
	}

	public String getWorkTime() {
		return workTime;
	}

	public void setWorkTime(String workTime) {
		this.workTime = workTime;
	}
	
	
	
}
