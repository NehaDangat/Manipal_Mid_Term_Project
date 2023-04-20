package com.hdfc.cilinOPD.Patient.vo;

import com.hdfc.cilinOPD.entity.Patient;

public class PatientAppointment {
	
	private Patient patient;
	
	private PatientAppointment appointment;
	
	public PatientAppointment() {
		super();
	}

	public PatientAppointment(Patient patient, PatientAppointment appointment) {
		super();
		this.patient = patient;
		this.appointment = appointment;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public PatientAppointment getAppointment() {
		return appointment;
	}

	public void setAppointment(PatientAppointment appointment) {
		this.appointment = appointment;
	}

}
