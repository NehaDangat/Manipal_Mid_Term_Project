package com.hdfc.cilinOPD.Doctor.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hdfc.cilinOPD.Doctor.DTO.DoctorDTO;
import com.hdfc.cilinOPD.Doctor.VO.Appointment;
import com.hdfc.cilinOPD.Doctor.VO.Schedule;
import com.hdfc.cilinOPD.Doctor.entity.Doctor;
import com.hdfc.cilinOPD.Doctor.exception.DoctorIDNotFound;


@Service
public interface IDoctorService {
	
	public Doctor addDoctor(DoctorDTO Ddto);
	
	public Doctor updateDoctor(Doctor ddto) throws DoctorIDNotFound ;
	
	public void deleteByDoctorId (long doctorId);

	public Doctor getByDoctorId(long doctorId);

	public List<Doctor> getAll();
	
	public List<Appointment> myAppointments (long doctorId);
	
	public Schedule addMySchedule(Schedule schedule);
		

}
