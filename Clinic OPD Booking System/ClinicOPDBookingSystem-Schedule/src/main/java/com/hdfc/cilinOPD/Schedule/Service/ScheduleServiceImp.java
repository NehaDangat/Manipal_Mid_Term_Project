package com.hdfc.cilinOPD.Schedule.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.hdfc.cilinOPD.Schedule.DTO.ScheduleDTO;
import com.hdfc.cilinOPD.Schedule.entity.Schedule;
import com.hdfc.cilinOPD.Schedule.repository.ScheduleRepository;



@Service
public class ScheduleServiceImp implements IScheduleService {

	@Autowired
	ScheduleRepository repo;
	
	@Autowired
	RestTemplate restTemplate;
	
	@Override
	public List<Schedule> getAll() {
	
		return repo.findAll();
	}

	@Override
	public Schedule updateSchedule(ScheduleDTO Sdto) {
		
		Schedule schedule = new Schedule();
		
		schedule.setDoctorId(Sdto.getDoctorId());
		schedule.setDayOfWeek(Sdto.getDayOfWeek());
		schedule.setTimeSlot(Sdto.getTimeSlot());
		schedule.setAvailability(Sdto.isAvailability());
		
		return repo.save(schedule);
	}

	@Override
	public Optional<Schedule> findById(long scheduleId) {
	
		return repo.findById(scheduleId);
	}

	@Override
	public Schedule addSchedule(ScheduleDTO Sdto) {
		
		Schedule schedule = new Schedule();
		
		schedule.setScheduleId(Sdto.getScheduleId());
		schedule.setDoctorId(Sdto.getDoctorId());
		schedule.setAvailability(Sdto.isAvailability());
		schedule.setDayOfWeek(Sdto.getDayOfWeek());
		schedule.setTimeSlot(Sdto.getTimeSlot());
		
		return repo.save(schedule);
	}

}
