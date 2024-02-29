package com.study.demo.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController("base")
@RequestMapping("/request")
public class RequestController {

    @PostMapping("/create")
    void addRequest (
            //some dto object
    ) {

    }


}
