package com.study.demo.dto;

import lombok.Builder;
import lombok.Data;
import java.time.Instant;

import java.util.UUID;
@Data
@Builder
public class OrderDto {
    private UUID uuid;
    private OrderType requestType;
    private OrderStatus requestStatus;
    private Priority priority;
    private String destination;
    private String comment;
    private Instant createdDate;
    private Instant executionDate;
    private Instant closedDate;


}
