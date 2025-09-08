package com.ChakreAditya.JobAppUsingSpringBoot;


import com.ChakreAditya.JobAppUsingSpringBoot.Service.JobService;
import com.ChakreAditya.JobAppUsingSpringBoot.model.JobPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class jobController {

    @Autowired
    JobService service;

    @GetMapping({"/","home"})
    public String home(){
        return "home";
    }

    @GetMapping("/addjob")
    public String addJob(){
        return "addjob";
    }

    @PostMapping("/handleForm")
    public String handleForm(JobPost jobpost){
        service.addJob(jobpost);
        return "success";
    }

    @GetMapping("/viewalljobs")
    public String viewData(Model m){
        List<JobPost> jobs = service.getAllJob();
        m.addAttribute("jobPosts",jobs);
        return "viewalljobs";
    }

}
