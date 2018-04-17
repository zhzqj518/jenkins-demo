package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsDemoApplication {

        @RequestMapping("/")
        public String hello()
        {
            return "Hello World! This is Jenkins generated!!!";
        }

	public static void main(String[] args) {
		SpringApplication.run(JenkinsDemoApplication.class, args);
	}
}
