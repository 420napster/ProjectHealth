package com.docode.projecthealth.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.docode.projecthealth.model.Patient;
import com.docode.projecthealth.repository.PatientRepository;
import com.docode.projecthealth.service.PatientService;

public class PatientServiceImpl implements PatientService{

	@Autowired
	PatientRepository patientRepo;
	
	@Override
	public void saveUser(Patient patient) {
		patientRepo.save(patient);
	}
}
