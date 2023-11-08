package br.com.john.projetobancobackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@EntityScan
@SpringBootApplication
public class ProjetoBancoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoBancoApplication.class, args);
	}

}
