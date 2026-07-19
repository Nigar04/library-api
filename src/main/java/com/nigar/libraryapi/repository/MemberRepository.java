package com.nigar.libraryapi.repository;

import com.nigar.libraryapi.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
