package no.eniro.eniropro.restbatch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestBatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestBatchApplication.class, args);
		System.out.println("HELLO SPRING");
		System.out.println(args);
	}

}
