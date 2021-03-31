package com.fu.cs1404.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DEPARTMENTS")
public class Department  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "d_Id", nullable = false)
	private String departmentId;
	
	@Column(name = "d_name", nullable = false)
	private String dName;
	
	@Column(name = "d_note", nullable = false)
	private String dNote;
	
	@Column(name = "d_manager", nullable = false)
	private String dManager;
	
	

	public Department() {
		super();
	}

	public Department(Long id, String dId, String dName, String dNote, String dManager) {
		super();
		this.id = id;
		this.departmentId = dId;
		this.dName = dName;
		this.dNote = dNote;
		this.dManager = dManager;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getdId() {
		return departmentId;
	}

	public void setdId(String dId) {
		this.departmentId = dId;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public String getdNote() {
		return dNote;
	}

	public void setdNote(String dNote) {
		this.dNote = dNote;
	}

	public String getdManager() {
		return dManager;
	}

	public void setdManager(String dManager) {
		this.dManager = dManager;
	}
	
	
}
