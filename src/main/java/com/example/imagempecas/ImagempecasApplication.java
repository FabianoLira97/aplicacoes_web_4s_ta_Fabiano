package com.example.imagempecas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ImagempecasApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImagempecasApplication.class, args);
	}

}
