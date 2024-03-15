package com.study.demo.controllers;

import java.util.*;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.study.demo.dto.OrderDto;
import com.study.demo.entity.User;
import com.study.demo.repository.UserRepository;
import com.study.demo.services.Request;
import com.study.demo.services.SimpleServive;
import lombok.RequiredArgsConstructor;
import org.hibernate.query.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController("api")
@RequestMapping("/v1/request")
public class RequestController {

    private final Request request;

    private final SimpleServive simpleServive;



    @PostMapping("/add")
    OrderDto addRequest (@RequestBody OrderDto newOrderDto) {
        return request.orderDto();
    }

    @GetMapping("/getAll")
    OrderDto getAllRequest () {
        return request.orderDto();
    }


    @GetMapping("/get/{uuid}")
    OrderDto getOneReq (@PathVariable ObjectIdGenerators.UUIDGenerator uuid) {
        return null;
    }

    @PutMapping("/edit/{uuid}")
    OrderDto editReq (@RequestBody OrderDto orderDto, @PathVariable ObjectIdGenerators.UUIDGenerator uuid) {

        return null;
    }

    @DeleteMapping("/delete/{uuid}")
    void deleteReq (@PathVariable ObjectIdGenerators.UUIDGenerator uuid) {

    }



    @GetMapping("/simple")
    public ResponseEntity<String> getSomething() {
        String response = simpleServive.getSimple();

        return ResponseEntity.ok(response);
    }


    @GetMapping("/simples")
    public ResponseEntity<List<User>> getAllSimples() {
        List<User> response = simpleServive.getSimpleUser();

        return ResponseEntity.ok(response);
    }



}
