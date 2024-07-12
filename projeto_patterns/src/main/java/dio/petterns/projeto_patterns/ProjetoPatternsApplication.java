package projeto_patterns.src.main.java.dio.petterns.projeto_patterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ProjetoPatternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoPatternsApplication.class, args);
	}

}
