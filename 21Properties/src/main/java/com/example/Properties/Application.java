package com.example.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({AppProperties.class,AppProperties2.class})
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}

}
