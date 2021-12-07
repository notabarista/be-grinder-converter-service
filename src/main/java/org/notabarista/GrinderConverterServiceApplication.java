package org.notabarista;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author codrea.tudor
 *
 */
@SpringBootApplication
@EnableSwagger2
public class GrinderConverterServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GrinderConverterServiceApplication.class, args);
	}

}
