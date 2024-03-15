package com.study.demo.repository;

import java.util.*;
import com.study.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository <User, Long>{

    @Query(value = "", nativeQuery = true)
    List<User> getAllByNameByQuery(String name);

    List<User> getAllByName(String name);
}
