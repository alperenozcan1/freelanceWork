package BitirmeProjesi.freelanceWork;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication

public class FreelanceWorkApplication {

	public static void main(String[] args) {
		SpringApplication.run(FreelanceWorkApplication.class, args);
		
	}
        @Bean
		public ModelMapper getModelMapper() {
			return new ModelMapper();
		}
}
