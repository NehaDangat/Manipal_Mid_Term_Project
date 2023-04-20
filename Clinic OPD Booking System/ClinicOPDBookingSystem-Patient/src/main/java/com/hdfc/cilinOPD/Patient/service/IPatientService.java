package com.hdfc.cilinOPD.Patient.service;

import java.util.List;

import com.hdfc.cilinOPD.Patient.VO.Appointment;
import com.hdfc.cilinOPD.Patient.entity.Patient;
import com.hdfc.cilinOPD.Patient.exception.PatientNotFound;
import com.hdfc.cilinOPD.PatientDTO.PatientDTO;


public  interface IPatientService<Doctor> {
	
	public Patient addPatient(PatientDTO Pdto);
	
	public Patient updatePatient(Patient pdto) ;
	
	public Patient getByPatientId(long patientId)throws PatientNotFound;
	
	public void deletePatient(long patientId)throws PatientNotFound;

	public List<Doctor> getDoctorInfoToPatient();
	
	public Appointment bookAppointment(Appointment appointment);
	
	public List<Appointment> viewMyAppointments(long patientId);

	
}
