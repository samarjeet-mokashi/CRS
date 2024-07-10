package com.boa.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableJpaRepositories("com.boa.repository")
@EntityScan("com.boa.entity")
@EnableWebMvc
@ComponentScan("com.boa")
public class CourseRegistrationSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseRegistrationSystemApplication.class, args);
	}

}
