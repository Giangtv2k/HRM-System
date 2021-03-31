package com.fu.cs1404.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.fu.cs1404.entity.Salary;

public interface SalaryRepository extends CrudRepository<Salary, Long>{

	Optional<Salary> findById(Long Id);
	
	List<Salary> findByStaffId(String staffId);
	
	@Query("select sl from Salary sl where sl.id = :id")
	Salary getById(@Param("id") Long id);
	//Salary findByStaffIdAndMonth(String staffId, String month);
}
