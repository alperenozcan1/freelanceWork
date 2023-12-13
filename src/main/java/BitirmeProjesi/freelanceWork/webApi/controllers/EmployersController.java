package BitirmeProjesi.freelanceWork.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import BitirmeProjesi.freelanceWork.business.abstracts.EmployerService;
import BitirmeProjesi.freelanceWork.business.requests.CreateEmployerRequest;
import BitirmeProjesi.freelanceWork.business.requests.UpdateEmployerRequest;
import BitirmeProjesi.freelanceWork.business.responses.GetAllEmployersResponse;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/employers")
@AllArgsConstructor
public class EmployersController {

	private EmployerService employerService;
	@GetMapping()
	 public List<GetAllEmployersResponse> getAll(){
   	return employerService.getAll();
   }
	@PostMapping()
	public void add(CreateEmployerRequest createEmployerRequest) {
		this.employerService.add(createEmployerRequest);
	}
	@PutMapping()
	public void update(@RequestBody UpdateEmployerRequest updateEmployerRequest) {
		this.employerService.update(updateEmployerRequest);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		this.employerService.delete(id);
	}
}
