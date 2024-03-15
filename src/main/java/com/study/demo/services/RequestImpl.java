package com.study.demo.services;


import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.study.demo.dto.OrderDto;
import com.study.demo.dto.OrderStatus;
import org.springframework.stereotype.Service;

@Service
public class RequestImpl implements Request {
    @Override
    public OrderDto orderDto() {
        return OrderDto.builder()
//                .requestType()
//                .priority()
                .requestStatus(OrderStatus.ACCEPTED)
//                .createdDate()
//                .executionDate()
//                .closedDate()
                .comment("d")
                .build();
    }

}
