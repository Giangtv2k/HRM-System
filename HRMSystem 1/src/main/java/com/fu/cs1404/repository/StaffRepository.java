package com.fu.cs1404.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.fu.cs1404.entity.Staff;

public interface StaffRepository extends CrudRepository<Staff, Long>{

	Optional<Staff> findById(Long Id);
	
	//Staff findByStaffId(String sId);
	
	List<Staff> findByDepartment(String department);
	
	List<Staff> findAll();
	
	@Query("select s from Staff s where s.sid =:staffId")
	Staff getById(@Param("staffId") Long staffId);
	
}
