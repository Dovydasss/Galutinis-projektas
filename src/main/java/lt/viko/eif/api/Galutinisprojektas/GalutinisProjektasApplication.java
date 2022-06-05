package lt.viko.eif.api.Galutinisprojektas;

import io.cucumber.junit.*;
import org.junit.runner.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan({"lt.viko.eif.api.Galutinisprojektas"})
@EntityScan("lt.viko.eif.api.Galutinisprojektas")
@EnableJpaRepositories("lt.viko.eif.api.Galutinisprojektas")

@SpringBootApplication
public class GalutinisProjektasApplication {

	public static void main(String[] args) {
		SpringApplication.run(GalutinisProjektasApplication.class, args);
	}



}
