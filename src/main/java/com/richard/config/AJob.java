package com.richard.config;

import com.richard.services.AService;
import org.quartz.Job;
import org.quartz.JobExecutionContext;

public class AJob implements Job {

    private final AService aService;

    public AJob(AService aService) {
        this.aService = aService;
    }

    @Override
    public void execute(JobExecutionContext context) {
        aService.printTime();
    }
}
