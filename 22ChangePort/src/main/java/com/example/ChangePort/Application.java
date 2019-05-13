package com.example.ChangePort;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {


		SpringApplication app =new SpringApplication(Application.class);
		Map<String,Object> map= new HashMap<String,Object>();
		map.put("server.port","9090");
		map.put("server.servlet.context-path","/app");
		app.setDefaultProperties(map);
		app.run(args);




	}

}
