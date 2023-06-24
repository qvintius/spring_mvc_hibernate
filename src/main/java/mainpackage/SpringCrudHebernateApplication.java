package mainpackage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
public class SpringCrudHebernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCrudHebernateApplication.class, args);
	}

}
