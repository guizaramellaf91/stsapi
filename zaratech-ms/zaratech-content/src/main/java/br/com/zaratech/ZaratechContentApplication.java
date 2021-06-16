package br.com.zaratech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan({"br.com.zaratech.core.model"})
@EnableJpaRepositories({"br.com.zaratech.core.repository"})
@ComponentScan("br.com.zaratech")
public class ZaratechContentApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZaratechContentApplication.class, args);
	}

}
