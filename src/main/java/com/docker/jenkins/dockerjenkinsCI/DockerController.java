package com.docker.jenkins.dockerjenkinsCI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {

    @GetMapping("/getMessage")
    public String messageGet(){
     return "Hi i am docker jenkins";
    }

    @GetMapping("/hii")
    public String getAccess(){
        return "hiii";
    }
}
