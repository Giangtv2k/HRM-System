package com.fu.cs1404.repository;

import java.util.Optional;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.fu.cs1404.entity.Attendance;

public interface AttendanceRepository extends CrudRepository<Attendance, Long>{
	
	Optional<Attendance> findById(Long id);
	
	//List<Attendance> findByStaffId(String staffId);
	
	@Query("select a from Attendance a where a.id = :id")
	Attendance getById(@Param("id") Long id);

}
