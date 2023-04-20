package com.hdfc.cilinOPD.appointment.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.Queue;

import com.hdfc.cilinOPD.appointment.DTO.AppointmentDTO;
import com.hdfc.cilinOPD.appointment.entity.Appointment;
import com.hdfc.cilinOPD.appointment.exception.AppointmentNotFoundException;



public interface IAppointmentService {
	
	public Appointment bookAppointment(AppointmentDTO appointment);
	
	public Appointment upadteAppointment(Appointment Adto);
	
	public Appointment getAppointmentById(Long appointmentId);
	
	public void deleteAppointment (long appointmentId);

	public Appointment getAppointment(Long appointmentId) throws AppointmentNotFoundException;

	public List<Appointment> getAppointmentsByPatient(Long patientId);
	
	public Appointment updateAppointmentStatus(Long appointmentId, String status);
	
	public List<Appointment> getAppointmentsByDoctor (Long doctorId);

	public List<Appointment> getAppointmentQueue();

	public void cancelAppointment(Long appointmentId);

	public Appointment rescheduleAppointment(Long appointmentd, Appointment appointment) throws AppointmentNotFoundException;

	public Appointment createAppointment(Appointment appointment);

	public Queue<Appointment> getUpcomingAppointments();
	
	public List<Appointment> getAppointmentByDate(LocalDate date);

	

	

	
	
	
}