package org.notabarista.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author codrea.tudor
 *
 */
@Configuration
@EnableSwagger2
public class SwaggerDocumentationConfiguration {

	ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Grinder Converter NAB API").description("NAB Grinder Converter Service").termsOfServiceUrl("")
				.version("0.0.1-SNAPSHOT").contact(new Contact("Not-A-Barista", "https://www.notabarrista.org/", "")).build();
	}

	@Bean
	public Docket configureControllerPackageAndConverters() {
		
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("org.notabarista.controller")).paths(PathSelectors.any())
				.build().apiInfo(new ApiInfoBuilder().version("0.1").title("Grinder Service API")
						.description("Documentation Grinder Converter Service API v0.1").build());
	}

}
