package com.hdfc.cilinOPD.Schedule.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hdfc.cilinOPD.Schedule.DTO.ScheduleDTO;
import com.hdfc.cilinOPD.Schedule.Service.IScheduleService;
import com.hdfc.cilinOPD.Schedule.entity.Schedule;


@RestController

@RequestMapping("/schedule")
public class ScheduleRestController {
	
	@Autowired
	IScheduleService service;
	
	@PostMapping("/addSchedule")
	public Schedule addSchedule(@RequestBody ScheduleDTO Sdto) {
		
		return service.addSchedule(Sdto);
	}
	
	@GetMapping("/getAll")
	public List<Schedule> getAll()
	{
		return service.getAll();
	}
	
	@PutMapping("/update")
	public Schedule updateSchedule(@RequestBody ScheduleDTO Sdto) {
		
		return service.updateSchedule(Sdto);
	}
	
	

}
