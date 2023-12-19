package BitirmeProjesi.freelanceWork.business.abstracts;

import java.util.List;

import BitirmeProjesi.freelanceWork.business.requests.CreateJobRequest;
import BitirmeProjesi.freelanceWork.business.requests.UpdateJobRequest;
import BitirmeProjesi.freelanceWork.business.responses.GetAllJobsResponse;
import BitirmeProjesi.freelanceWork.business.responses.GetByIdJobResponse;
import BitirmeProjesi.freelanceWork.business.responses.GetByNameJobResponse;

public interface JobService {
	List<GetAllJobsResponse> getAll(); 
	GetByIdJobResponse getById(int id);
	List<GetByNameJobResponse> getByName(String name);
	public void add(CreateJobRequest createJobRequest);
	public void update(UpdateJobRequest updateJobRequest);
	void delete(int id);
}
