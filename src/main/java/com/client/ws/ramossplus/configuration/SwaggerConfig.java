package com.client.ws.ramossplus.configuration;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class SwaggerConfig {

	@Configuration
	public class SwaggerConfig {

	@Bean
	public Docket api() {
		return new Docket(Do)
		}
	}
}
