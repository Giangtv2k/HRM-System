package com.fu.cs1404.repository;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.fu.cs1404.entity.Department;

public interface DepartmentRepository extends CrudRepository<Department, Long>{
	
	Department findByDepartmentId(String dId);
	
	@Query("select d from Department d where d.id = :id")
	Department getById(@Param("id") Long id);
	
}
