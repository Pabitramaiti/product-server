package net.codejava;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@EnableAutoConfiguration
@RestController
public class DockerProductController {

	@GetMapping("/products")
	public String getMessage() {
		return "A brand new product!";
	}
}
