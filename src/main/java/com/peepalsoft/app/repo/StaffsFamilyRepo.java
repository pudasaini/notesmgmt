package com.peepalsoft.app.repo;

import com.peepalsoft.app.entity.StaffsFamily;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StaffsFamilyRepo extends JpaRepository<StaffsFamily, Integer>{
	public List<StaffsFamily> findByStaffsCode(String code);

}
