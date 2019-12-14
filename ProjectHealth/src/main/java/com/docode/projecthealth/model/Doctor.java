package com.docode.projecthealth.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToOne;

public class Doctor {
	@Id
	@GeneratedValue
	private Long doctorId;
	@Column
	@OneToOne
	@JoinColumn(name="userId",nullable=false)
	private User user;
	@Column(nullable=false)
	private String specialization;
	public Long getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(Long doctorId) {
		this.doctorId = doctorId;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	
	
}
