package com.example.Order;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class App1 implements CommandLineRunner {


    @Override
    public void run(String... args) throws Exception {
        System.out.println("order1");
    }
}
