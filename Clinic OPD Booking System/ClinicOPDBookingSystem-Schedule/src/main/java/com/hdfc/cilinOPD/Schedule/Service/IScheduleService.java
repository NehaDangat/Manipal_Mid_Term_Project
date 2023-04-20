package com.hdfc.cilinOPD.Schedule.Service;

import java.util.List;
import java.util.Optional;

import com.hdfc.cilinOPD.Schedule.DTO.ScheduleDTO;
import com.hdfc.cilinOPD.Schedule.entity.Schedule;




public interface IScheduleService {
	
	public Schedule addSchedule(ScheduleDTO Sdto);
	
	public List<Schedule> getAll();
	
	public Schedule updateSchedule(ScheduleDTO Sdto);
	
	public Optional<Schedule> findById(long scheduleId);

}
