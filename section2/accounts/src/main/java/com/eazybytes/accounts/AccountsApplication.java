package com.eazybytes.accounts;

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
		info=@Info(
				title = "Account Microservices REST APIs",
				description = "EAZY BANK CRUD Operations API Documentations",
				version = "v1",
				contact = @Contact(
						name = "Mayank Srivastava",
						email = "jmd.mayanks@gmail.com",
						url = "eazybyte.com"
				),
				license = @License(
					name = "Apache 2.0",
					url = "https://www.eazybytes.com"
				)
		), externalDocs = @ExternalDocumentation (
				description = "Eazy Bank Accounts microservices REST API documentation",
				url= "https://www.eazybytes.com/swagger-ui.html"
		)
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
