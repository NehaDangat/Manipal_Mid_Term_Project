package com.hdfc.cilinOPD.appointment.exception;

public class AppointmentNotFoundException extends Exception {

	public AppointmentNotFoundException(Long id) {
		
		System.out.println("Appointment Not Found");
	}

}
