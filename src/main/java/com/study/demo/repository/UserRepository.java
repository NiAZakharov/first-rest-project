package com.study.demo.repository;

import com.study.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends  JpaRepository <User, Long>{
}
