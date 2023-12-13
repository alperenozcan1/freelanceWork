package BitirmeProjesi.freelanceWork.business.abstracts;

import java.util.List;

import BitirmeProjesi.freelanceWork.business.requests.CreateEmployerRequest;
import BitirmeProjesi.freelanceWork.business.requests.UpdateEmployerRequest;
import BitirmeProjesi.freelanceWork.business.responses.GetAllEmployersResponse;

public interface EmployerService {
	List<GetAllEmployersResponse> getAll(); 
	public void add(CreateEmployerRequest createEmployerRequest);
	public void update(UpdateEmployerRequest updateEmployerRequest);
	public void delete(int id);
}
