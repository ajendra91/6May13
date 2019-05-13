package com.example.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AppController {

    @Autowired
    public Environment env;

    @Value("${name}")
    public String name;

    @Autowired
    public AppProperties app;

    @Autowired
    public AppProperties2 app2;

    @RequestMapping("/")
    @ConfigurationProperties(value = "facebook.id")
    public String hello(){
        return env.getProperty("name")+""+name+""+
                app2.name2+""+app.getAuth().getTokenExpirationMsec();
    }

    @RequestMapping("/app2")
    public List<String> getApp2(){
        return app.getOauth2().getAuthorizedRedirectUris();
    }



}
