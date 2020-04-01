package com.peepalsoft.app.repo;

import com.peepalsoft.app.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepo extends JpaRepository<Member ,Integer> {
}
