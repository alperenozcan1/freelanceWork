package BitirmeProjesi.freelanceWork.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import BitirmeProjesi.freelanceWork.business.abstracts.EmployeeService;
import BitirmeProjesi.freelanceWork.business.requests.CreateEmployeeRequest;
import BitirmeProjesi.freelanceWork.business.requests.UpdateEmployeeRequest;
import BitirmeProjesi.freelanceWork.business.responses.GetAllEmployeesResponse;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/employee")
@AllArgsConstructor
@CrossOrigin
public class EmployeesController {
	private EmployeeService employeeService;

	@GetMapping("/getall")
	 public List<GetAllEmployeesResponse> getAll(){
  	return employeeService.getAll();
  }
	@PostMapping("/add")
	public void add(CreateEmployeeRequest createEmployeeRequest) {
		this.employeeService.add(createEmployeeRequest);
	}
	
	@PutMapping("/update")
	public void update(@RequestBody UpdateEmployeeRequest updateEmployeeRequest) {
		this.employeeService.update(updateEmployeeRequest);
	}
	
	@DeleteMapping("/{id}")
	public void delete(int id) {
		this.employeeService.delete(id);
	}
}
