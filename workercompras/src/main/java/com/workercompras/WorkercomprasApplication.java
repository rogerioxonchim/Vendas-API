package com.workercompras;

import com.workercompras.service.CepService;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@EnableFeignClients
@EnableRabbit
@SpringBootApplication
public class WorkercomprasApplication {

	@Autowired
	private CepService cepService;

	public static void main(String[] args) {
		SpringApplication.run(WorkercomprasApplication.class, args);
	}

	@Bean
	void teste(){
		cepService.buscarCep("16700000");
	}

}
