package net.codejava;

import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@RestController
@EnableAutoConfiguration
@SpringBootApplication
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