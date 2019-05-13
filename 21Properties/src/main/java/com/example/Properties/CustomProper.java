package com.example.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PropertySource(value = "ajay.properties")
public class CustomProper {

    @Autowired
    public Environment env;

    @RequestMapping("/ajay")
    public String getAjay(){
        return env.getProperty("ajay");
    }

}
