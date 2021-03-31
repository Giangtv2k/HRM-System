package com.fu.cs1404.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "REQUESTS")
public class Request  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "staff_id", nullable = false)
	private String staffId;
	
	@Column(name = "staff_name", nullable = false)
	private String staffname;
	
	@Column(name = "r_date", nullable = false)
	private String rDate;
	
	@Column(name = "r_type", nullable = false)
	private int rType;
	
	@Column(name = "r_content", nullable = false)
	private String rContent;
	
	@Column(name = "s_date_leave", nullable = false)
	private String sLeave;
	
	@Column(name = "e_date_leave", nullable = false)
	private String eLeave;
	
	@Column(name = "status", nullable = false)
	private String status;
	
	@Column(name = "approver", nullable = false)
	private String approver;
	
	@Column(name = "note", nullable = false)
	private String note;
	
	

	public Request() {
		super();
	}



	public Request(Long id, String staffId, String staffname, String rDate, int rType, String rContent, String sLeave,
			String eLeave, String status, String approver, String note) {
		super();
		this.id = id;
		this.staffId = staffId;
		this.staffname = staffname;
		this.rDate = rDate;
		this.rType = rType;
		this.rContent = rContent;
		this.sLeave = sLeave;
		this.eLeave = eLeave;
		this.status = status;
		this.approver = approver;
		this.note = note;
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



	public String getrDate() {
		return rDate;
	}



	public void setrDate(String rDate) {
		this.rDate = rDate;
	}



	public int getrType() {
		return rType;
	}



	public void setrType(int rType) {
		this.rType = rType;
	}



	public String getrContent() {
		return rContent;
	}



	public void setrContent(String rContent) {
		this.rContent = rContent;
	}



	public String getsLeave() {
		return sLeave;
	}



	public void setsLeave(String sLeave) {
		this.sLeave = sLeave;
	}



	public String geteLeave() {
		return eLeave;
	}



	public void seteLeave(String eLeave) {
		this.eLeave = eLeave;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public String getApprover() {
		return approver;
	}



	public void setApprover(String approver) {
		this.approver = approver;
	}



	public String getNote() {
		return note;
	}



	public void setNote(String note) {
		this.note = note;
	}



	
	
}
