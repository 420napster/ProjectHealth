package com.docode.projecthealth.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class Patient {
	
	@Id
	@GeneratedValue
	private Long patientId;
	@Column(nullable = false)
	private Long userId;
	@OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "userId", nullable = false)
    private User user;
	public Long getPatientId() {
		return patientId;
	}
	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<String> getAllergies() {
		return allergies;
	}
	public void setAllergies(List<String> allergies) {
		this.allergies = allergies;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public List<String> getChronicDisease() {
		return chronicDisease;
	}
	public void setChronicDisease(List<String> chronicDisease) {
		this.chronicDisease = chronicDisease;
	}
	@Column
	private List<String> allergies;
	@Column
	private String bloodGroup;
	@Column
	private List<String> chronicDisease;
	
}
