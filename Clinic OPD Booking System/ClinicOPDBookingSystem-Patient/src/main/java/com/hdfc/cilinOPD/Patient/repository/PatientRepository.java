package com.hdfc.cilinOPD.Patient.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.hdfc.cilinOPD.Patient.entity.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

	

//	public List<Doctor> findAll(PatientDotcor patientDoctor);
//
////	public List<Doctor> findAll(Doctor doctor);
//	public List<PatientDotcor> findAll();
	
}
