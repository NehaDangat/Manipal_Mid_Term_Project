package com.hdfc.cilinOPD.Schedule.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hdfc.cilinOPD.Schedule.entity.Schedule;


@Repository
public interface ScheduleRepository extends JpaRepository<Schedule, Long> {

	/*public List<Schedule> findByDoctorIdAndStartDateTimeGreaterThanEqualAndEndDateTimeLessThanEqualAndIsAvailableTrue(
			Long doctorId, LocalDateTime startDateTime, LocalDateTime endDateTime) {
		
		return ;
	}
*/


}
