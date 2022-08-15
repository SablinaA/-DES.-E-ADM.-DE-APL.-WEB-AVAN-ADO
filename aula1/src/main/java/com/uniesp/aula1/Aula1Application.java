package com.uniesp.aula1;

import controller.Hello_world;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Aula1Application {

	public static void main(String[] args) {
		SpringApplication.run(Hello_world.class, args);
	}

}
