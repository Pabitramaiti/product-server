package net.codejava.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.apache.logging.log4j.message.Message;
import org.springframework.web.bind.annotation.*;

//@EnableAutoConfiguration
@RestController
//@RequestMapping("/product-server")
public class DockerProductController {

	//@GetMapping("/products")
	@RequestMapping (method = RequestMethod.HEAD, value = "/products")
	@Operation(summary = "Get messages")
	public String getMessage() {
		return "A brand new product!";
	}

	@GetMapping(value = "/getMessages/{msg}")
	@Operation(summary = "Get messages with parameter")
	public String getMessage(@PathVariable String msg) {
		return msg;
	}
}
