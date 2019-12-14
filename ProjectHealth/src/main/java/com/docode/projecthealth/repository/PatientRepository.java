package com.docode.projecthealth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.docode.projecthealth.model.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long>{

}
