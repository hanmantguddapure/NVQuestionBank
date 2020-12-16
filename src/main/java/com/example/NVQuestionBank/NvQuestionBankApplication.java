package com.example.NVQuestionBank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.example")
@EntityScan("com.example.NVQuestionBank.entity")
public class NvQuestionBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(NvQuestionBankApplication.class, args);
	}

}
