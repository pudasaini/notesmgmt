package com.peepalsoft.app.repo;

import com.peepalsoft.app.entity.Office;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfficeRepo extends JpaRepository<Office, Integer>{
	
	

}
