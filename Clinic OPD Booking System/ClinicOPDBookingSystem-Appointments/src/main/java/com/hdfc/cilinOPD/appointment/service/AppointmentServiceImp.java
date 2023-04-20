package com.hdfc.cilinOPD.appointment.service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Queue;

import javax.persistence.EntityNotFoundException;

import org.hibernate.query.criteria.internal.expression.function.CurrentDateFunction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.hdfc.cilinOPD.appointment.DTO.AppointmentDTO;
import com.hdfc.cilinOPD.appointment.VO.Doctor;
import com.hdfc.cilinOPD.appointment.entity.Appointment;
import com.hdfc.cilinOPD.appointment.exception.AppointmentNotFoundException;
import com.hdfc.cilinOPD.appointment.repository.AppointmentRepository;

@Service
public class AppointmentServiceImp implements IAppointmentService {
	
	@Autowired
	AppointmentRepository repo;
	
	@Autowired
	RestTemplate restTemplate;
	
	//@Autowired
	//private JavaMailSender mailSender;
	
	@Override
	public Appointment bookAppointment(AppointmentDTO Adto) {
		
		Appointment appointment = new Appointment();
		
		appointment.setAppointmentId(Adto.getAppointmentId());
		appointment.setDate(Adto.getDate());
		appointment.setDoctorId(Adto.getDoctorId());
		appointment.setPatientId(Adto.getPatientId());
		appointment.setStatus(Adto.getStatus());
		appointment.setTime(Adto.getTime());
		
		return repo.save(appointment);
	}
	
	@Override
	public Appointment upadteAppointment(Appointment Adto) {
		
		Optional<Appointment> opt = repo.findById(Adto.getAppointmentId());
		
		if(opt.isPresent()) {
			
			return repo.save(Adto);
			
		}
		return Adto;
	}

	@Override
    public Appointment getAppointmentById(Long appointmentId) {
        return repo.findById(appointmentId)
                .orElseThrow(() -> new EntityNotFoundException("Appointment not found with id " + appointmentId));
    }
	
	@Override
	public List<Appointment> getAppointmentsByDoctor(Long doctorId) {
		
		List<Appointment> appointments = repo.findByDoctorId(doctorId);
		
		
	    	
	      return appointments;
	
	}

	@Override
	public List<Appointment> getAppointmentsByPatient(Long patientId) {
		// TODO Auto-generated method stub
		return repo.findByPatientId(patientId);
	}

	
	@Override
    public Appointment updateAppointmentStatus(Long appointmentId, String status) {
        Appointment appointment = getAppointmentById(appointmentId);
        appointment.setStatus(status);
        return repo.save(appointment);
    }

	@Override
	public void deleteAppointment(long appointmentId) {
		
		repo.deleteById(appointmentId);
	}

	@Override
	public List<Appointment> getAppointmentQueue() {
		
		List<Appointment> appointmentQueue = repo.findAll();
        
        return appointmentQueue;
		
	}

	@Override
	public void cancelAppointment(Long appointmentId) {
		
		repo.deleteById(appointmentId);
		
	}

	@Override
	public Appointment rescheduleAppointment(Long appointmentId, Appointment appointment) throws AppointmentNotFoundException {
		
		Appointment oldAppointment = repo.findById(appointmentId)
                .orElseThrow(() -> new AppointmentNotFoundException(appointmentId));
		
        // update old Appointment with appointment data
        Appointment updatedAppointment = repo.save(oldAppointment);
        return updatedAppointment;
        
	}

	@Override
	public Appointment createAppointment(Appointment appointment) {
		
		return repo.save(appointment);
		
	}

	@Override
	public Appointment getAppointment(Long appointmentId) throws AppointmentNotFoundException {
		
		return repo.findById(appointmentId)
                .orElseThrow(() -> new AppointmentNotFoundException(appointmentId));
	}
    
	@Override
	public Queue<Appointment> getUpcomingAppointments() {
      
		LocalDate currentDate = LocalDate.now();
        List<Appointment> appointments = repo.findByDateGreaterThanEqualOrderByDateAsc(currentDate);
        Queue<Appointment> appointmentQueue = new LinkedList<>(appointments);
        return appointmentQueue;
    }

	@Override
	public List<Appointment> getAppointmentByDate(LocalDate date) {
		
		return repo.findByDateGreaterThanEqualOrderByDateAsc(date);
	}

	
	
	
}
