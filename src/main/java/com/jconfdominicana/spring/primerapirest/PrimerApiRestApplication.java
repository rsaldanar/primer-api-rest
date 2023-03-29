package com.jconfdominicana.spring.primerapirest;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PrimerApiRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimerApiRestApplication.class, args);
	}

	@Bean
	public OpenAPI customOpenAPI() {
		return new OpenAPI()
				.info(new Info()
						.title("*** Documentación del Api-Rest ***")
						.version("V0.0.1")
						.description("Mi Primer Api-Rest Spring Boot con Swagger")
						.termsOfService("http://swagger.io/terms/")
						.license(new License().name("Apache 2.0").url("http://springdoc.org")));
	}
}
