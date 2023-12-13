package BitirmeProjesi.freelanceWork.business.abstracts;

import java.util.List;

import BitirmeProjesi.freelanceWork.business.requests.CreateEmployeeRequest;
import BitirmeProjesi.freelanceWork.business.requests.UpdateEmployeeRequest;
import BitirmeProjesi.freelanceWork.business.responses.GetAllEmployeesResponse;

public interface EmployeeService {
	List<GetAllEmployeesResponse> getAll(); 
	public void add(CreateEmployeeRequest createEmployeeRequest);
	public void update(UpdateEmployeeRequest updateEmployeeRequest);
	public void delete(int id);
}
