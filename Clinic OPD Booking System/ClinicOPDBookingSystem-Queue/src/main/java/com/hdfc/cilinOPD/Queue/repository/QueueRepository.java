package com.hdfc.cilinOPD.Queue.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hdfc.cilinOPD.Queue.entity.Queue;

@Repository
public interface QueueRepository extends JpaRepository<Queue, Long> {

	//public List<Queue> getAllQueueWithAppointments();
}
