package BitirmeProjesi.freelanceWork;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import BitirmeProjesi.freelanceWork.core.utilities.exceptions.ProblemDetails;

@SpringBootApplication
@RestControllerAdvice
public class FreelanceWorkApplication {

	public static void main(String[] args) {
		SpringApplication.run(FreelanceWorkApplication.class, args);
		
	}
	
	@ExceptionHandler
	@ResponseStatus(code=HttpStatus.BAD_REQUEST)
	public ProblemDetails handleValidationException(MethodArgumentNotValidException methodArgumentNotValidException) {
		ProblemDetails problemDetails=new ProblemDetails();
		problemDetails.setMessage("VALIDATION EXCEPTION");
		
		return problemDetails;
	}
	
	
        @Bean
		public ModelMapper getModelMapper() {
			return new ModelMapper();
		}
}
