package com.example.docker;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker")
public class DockerController {

    @GetMapping("/example1")
    public String dockerExample1 () {
        return "Hello World!!";
    }

}
