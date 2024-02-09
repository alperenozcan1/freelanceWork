package BitirmeProjesi.freelanceWork.business.abstracts;

import java.util.List;

import BitirmeProjesi.freelanceWork.business.requests.CreateApplicationRequest;
import BitirmeProjesi.freelanceWork.business.responses.GetAllApplicationsResponse;
import BitirmeProjesi.freelanceWork.business.responses.GetByJobIdApplicationResponse;


public interface ApplicationService {
	public void add(CreateApplicationRequest createApplicationRequest);
	List<GetAllApplicationsResponse> getAll(); 
	void delete(int id);
	List<GetByJobIdApplicationResponse> getByJobIdApplication(int jobId);
	
}
