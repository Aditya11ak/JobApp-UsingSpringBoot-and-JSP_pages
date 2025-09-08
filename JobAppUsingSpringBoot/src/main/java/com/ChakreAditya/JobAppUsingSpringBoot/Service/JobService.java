package com.ChakreAditya.JobAppUsingSpringBoot.Service;

import com.ChakreAditya.JobAppUsingSpringBoot.Repo.JobRepo;
import com.ChakreAditya.JobAppUsingSpringBoot.model.JobPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo repo;

    public void addJob(JobPost jobpost){
        repo.addJob(jobpost);
    }

    public List<JobPost> getAllJob(){
        return repo.getAllJobs();
    }
}
