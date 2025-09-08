package com.ChakreAditya.JobAppUsingSpringBoot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class JobPost {

    private int postId;
    private String postProfile;
    private String PostDesc;
    private int ReqExperience;
    private List<String> postTechStack;

}
