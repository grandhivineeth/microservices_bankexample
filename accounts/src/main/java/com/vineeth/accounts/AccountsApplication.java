package com.vineeth.accounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Accounts Microservice REST API Documentation",
				description = "Accounts Microservice REST API Documentation",
				version = "1.0",
				contact = @Contact(
						name = "Vineeth",
						email = "dHd3j@example.com"),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.apache.org/licenses/LICENSE-2.0")),
				externalDocs = @ExternalDocumentation(
						description = "Spring Boot Documentation",
						url = "https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/")
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
