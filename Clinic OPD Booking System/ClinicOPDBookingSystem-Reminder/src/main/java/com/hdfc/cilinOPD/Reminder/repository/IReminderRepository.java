package com.hdfc.cilinOPD.Reminder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hdfc.cilinOPD.Reminder.entity.Reminder;

@Repository
public interface IReminderRepository extends JpaRepository<Reminder, Long> {

}
