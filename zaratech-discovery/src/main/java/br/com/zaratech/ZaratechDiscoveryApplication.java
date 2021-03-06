package br.com.zaratech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ZaratechDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZaratechDiscoveryApplication.class, args);
	}

}
