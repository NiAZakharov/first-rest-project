package com.study.demo.dto;

import lombok.Builder;
import lombok.Data;

import javax.xml.transform.sax.SAXResult;
import java.time.Instant;
import java.util.UUID;

@Data
@Builder
public class UserDto {

    private UUID uuid;
    private String firstName;
    private String secondName;
    private String address;
    private Instant dataLastOrder;
}
