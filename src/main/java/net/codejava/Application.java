package net.codejava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//@RestController
@SpringBootApplication
//@EnableSwagger2
@OpenAPIDefinition (info = @Info (title = "Product API", version = "3", description = "Product api swagger defination"))
public class Application {

	/*@RequestMapping("/getmessage")
	String home() {
		return "Hello World Spring Boot!";
	}*/

	public static void main(String[] args) throws Exception {
		System.out.println("Product-Server:::: Inside main method....");
		
		SpringApplication.run(Application.class, args);
		System.out.println("Application is started....");
		/*Map<String, String> envs= System.getenv();
		if(envs!=null) {
			for(String key: envs.keySet()) {
				System.out.println("Key: " + key + " Value: " + System.getenv(key));
			}
		}*/
	}

}