package com.imukov.bdeck;

import com.imukov.bdeck.domain.PersonEntity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BdeckApplication {

	public static void main(String[] args) {
		SpringApplication.run(BdeckApplication.class, args);
	}
    PersonEntity personEntity = new PersonEntity("name", "nickname", "password");
}
