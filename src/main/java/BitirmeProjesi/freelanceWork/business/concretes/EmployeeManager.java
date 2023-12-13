package BitirmeProjesi.freelanceWork.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import BitirmeProjesi.freelanceWork.business.abstracts.EmployeeService;
import BitirmeProjesi.freelanceWork.business.requests.CreateEmployeeRequest;
import BitirmeProjesi.freelanceWork.business.requests.UpdateEmployeeRequest;
import BitirmeProjesi.freelanceWork.business.responses.GetAllEmployeesResponse;
import BitirmeProjesi.freelanceWork.core.utilities.mappers.ModelMapperService;
import BitirmeProjesi.freelanceWork.dataAccess.abstracts.EmployeeRepository;
import BitirmeProjesi.freelanceWork.entities.concretes.Employee;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployeeManager implements EmployeeService{
	private EmployeeRepository employeeRepository;
	private ModelMapperService modelMapperService;
	
	@Override
	public void add(CreateEmployeeRequest createEmployeeRequest) {
		Employee employee = this.modelMapperService.forRequest().map(createEmployeeRequest, Employee.class);
		this.employeeRepository.save(employee);
		
	}

	@Override
	public void update(UpdateEmployeeRequest updateEmployeeRequest) {
		Employee employee = this.modelMapperService.forRequest().map(updateEmployeeRequest, Employee.class);
		this.employeeRepository.save(employee);
		
	}

	@Override
	public void delete(int id) {
		this.employeeRepository.deleteById(id);
		
	}

	@Override
	public List<GetAllEmployeesResponse> getAll() {
		List<Employee> employees = employeeRepository.findAll();

		List<GetAllEmployeesResponse> employeesResponse = employees.stream()
				.map(employee -> this.modelMapperService.forResponse().map(employee, GetAllEmployeesResponse.class))
				.collect(Collectors.toList());

		return employeesResponse;
	}

}
