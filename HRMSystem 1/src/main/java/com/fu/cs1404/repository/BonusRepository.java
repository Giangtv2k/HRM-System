package com.fu.cs1404.repository;

import java.util.Optional;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.fu.cs1404.entity.Bonus;

public interface BonusRepository extends CrudRepository<Bonus, Long>{
	
	Optional<Bonus> findById(Long id);
	
	//List<Bonus> findByStaffId(String staffId);
	
	@Query("select b from Bonus b where b.id = :id")
	Bonus getById(@Param("id")Long id);

}
