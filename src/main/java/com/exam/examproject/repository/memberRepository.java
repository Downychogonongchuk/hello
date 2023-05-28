package com.exam.examproject.repository;

import com.exam.examproject.dto.member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface memberRepository extends JpaRepository<member,Long> {

    public member findByAccount(String account);
    public List<member> findByName(String name);
    public  member findByPhone (String phone);
}
