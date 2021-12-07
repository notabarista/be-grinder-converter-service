package org.notabarista.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author codrea.tudor
 *
 */
@Api(tags = { "Main API" })
@Controller
@EnableWebMvc
@Log4j2
public class StaticController {

	@ApiOperation(value = "View resource", response = String.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully retrieved resource"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found") })
	@GetMapping("/")
	public String index() {
		if (log.isInfoEnabled()) {
			log.info("Redirecting to index!");
		}
		return "index";
	}

}
