package com.hdfc.cilinOPD.Queue.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.hdfc.cilinOPD.Queue.DTO.QueueDTO;
import com.hdfc.cilinOPD.Queue.Service.IQueueService;
import com.hdfc.cilinOPD.Queue.VO.QueueReminder;
import com.hdfc.cilinOPD.Queue.entity.Queue;



@RestController

@RequestMapping("/queue")
public class QueueRestController {
	
	@Autowired
	IQueueService service;
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/getAll")
	public List<Queue> getAll(){
		
		return service.getAll();
	}
	
	@GetMapping("/queue")
    public Queue getAppointmentQueue() {
		
        Queue appointmentQueue = service.getAppointmentQueue();
        // prioritize urgent cases in appointment queue
        return appointmentQueue;
    }
	
	@PutMapping("/update")
	public Queue updateQueue(@RequestBody QueueDTO Qdto) {
		
		return service.updateQueue(Qdto);
	}
	
	@GetMapping("/get/quewithrem/{queueId}")
	  public  QueueReminder	getQueueByIdWithReminder(@PathVariable Long queueId) {
	  
	  return service.getQueueByIdWithReminder(queueId);
	  
	  }


}
