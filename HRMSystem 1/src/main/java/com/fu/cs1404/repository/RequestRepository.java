package com.fu.cs1404.repository;

import java.util.Optional;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.fu.cs1404.entity.Request;

public interface RequestRepository extends CrudRepository<Request, Long>{
	
	Optional<Request> findById(Long Id);
	
	//List<Request> findByStaffId(String staffId);
	
	@Query("select r from Request r where r.id = :id")
	Request getById(@Param("id") Long id);
}
