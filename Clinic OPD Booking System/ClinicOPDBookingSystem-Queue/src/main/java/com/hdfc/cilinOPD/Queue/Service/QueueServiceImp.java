package com.hdfc.cilinOPD.Queue.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.hdfc.cilinOPD.Queue.DTO.QueueDTO;
import com.hdfc.cilinOPD.Queue.VO.QueueReminder;
import com.hdfc.cilinOPD.Queue.VO.Reminder;
import com.hdfc.cilinOPD.Queue.entity.Queue;
import com.hdfc.cilinOPD.Queue.repository.QueueRepository;


@Service
public class QueueServiceImp implements IQueueService {

	@Autowired
	QueueRepository repo;
	
	@Autowired
	RestTemplate restTemplate;
	
	@Override
	public List<Queue> getAll() {
		
		return repo.findAll();
	}

	@Override
	public Queue updateQueue(QueueDTO Qdto) {
		
		Queue queue = new Queue();
		
		queue.setAppointmentId(Qdto.getAppointmentId());
		queue.setQueueNumber(Qdto.getQueueNo());
		queue.setQueueStatus(Qdto.getQueueStatus());
		
		return repo.save(queue);
	}

	@Override
	public Queue getAppointmentQueue() {
		
		Queue appointments =  restTemplate.getForObject("http://localhost:2003/api/appointment/upComingQueue",Queue.class);
		
		return appointments;
	}
	
	@Override
	public Queue getQueueById(Long queueId) {
		
		return repo.findById(queueId).orElse(null);
	}

	@Override
	public QueueReminder getQueueByIdWithReminder(Long queueId) {
		
	Queue queue =	getQueueById(queueId);
		
		long reminderId = queue.getAppointmentId();
		
		Reminder reminder =      restTemplate.getForObject("http://localhost:2010/api/remainder/get/"+reminderId, Reminder.class);

		QueueReminder queRem = new QueueReminder(queue,reminder);
		
		return queRem;
	}

	

}
