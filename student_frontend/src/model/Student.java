package model;

import java.util.Date;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "student")
@SessionScoped
public class Student {
	
	private String name;
	private String surName;
	private Date dateOfBirth;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public StudentEntity getEntity() {
		
		StudentEntity studentEntity = new StudentEntity();
		
		studentEntity.setName(name);
		studentEntity.setSurName(surName);
		studentEntity.setDateOfBirth(dateOfBirth);
		
		return studentEntity;
	}
	
}
