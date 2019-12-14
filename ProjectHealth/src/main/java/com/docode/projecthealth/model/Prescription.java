package com.docode.projecthealth.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class Prescription {
	@Id
	@GeneratedValue
	private Long prescriptionId;
	@Column
	@OneToOne
	@JoinColumn(name="visitId",nullable=false)
	private Visit visit;
	@Column
	private List<String> medicines;
	@Column
	private List<String> tests;
	public Long getPrescriptionId() {
		return prescriptionId;
	}
	public void setPrescriptionId(Long prescriptionId) {
		this.prescriptionId = prescriptionId;
	}
	public Visit getVisit() {
		return visit;
	}
	public void setVisit(Visit visit) {
		this.visit = visit;
	}
	public List<String> getMedicines() {
		return medicines;
	}
	public void setMedicines(List<String> medicines) {
		this.medicines = medicines;
	}
	public List<String> getTests() {
		return tests;
	}
	public void setTests(List<String> tests) {
		this.tests = tests;
	}
	
}
