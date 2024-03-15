package com.study.demo.services.impl;

import java.util.*;
import com.study.demo.entity.User;
import com.study.demo.repository.UserRepository;
import com.study.demo.services.SimpleServive;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class SimpleServiceImpl implements SimpleServive {

    private final UserRepository userRepository;


    @Override
    public String getSimple() {
        return "SIMPLE!!!!";
    }

    @Override
    public List<User> getSimpleUser() {
        List<User> users = userRepository.findAll();
        log.info("{} users were found.", users.size());
        return users;
    }
}
