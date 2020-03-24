package com.peepalsoft.app.repo;

import com.peepalsoft.app.entity.Office;
import com.peepalsoft.app.entity.Staffs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StaffsRepo extends JpaRepository<Staffs, String>{
	public List<Staffs> findByOffice(Office office);

}
