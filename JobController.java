package com.yazhini.hirehub.controller;

import com.yazhini.hirehub.model.Job;
import com.yazhini.hirehub.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobs")
public class JobController {

    @Autowired
    private JobService jobService;

    @GetMapping
    public List<Job> getJobs() {
        return jobService.getAllJobs();
    }

    @PostMapping
    public Job addJob(@RequestBody Job job) {
        return jobService.addJob(job);
    }
}
