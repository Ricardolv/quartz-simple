package com.richard.config;

import com.richard.services.BService;
import org.quartz.Job;
import org.quartz.JobExecutionContext;

public class BJob implements Job {

    private final BService bService;

    public BJob(BService bService) {
        this.bService = bService;
    }

    @Override
    public void execute(JobExecutionContext context) {
        bService.printTime();
    }
}
