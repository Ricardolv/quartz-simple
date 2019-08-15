package com.richard.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class BService {

    public void printTime() {
        log.info("Job b says hi !");
    }
}
