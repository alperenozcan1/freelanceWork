package BitirmeProjesi.freelanceWork.business.abstracts;

import BitirmeProjesi.freelanceWork.business.requests.CreateApplicationRequest;
import BitirmeProjesi.freelanceWork.business.requests.UpdateApplicationRequest;

public interface ApplicationService {
	public void add(CreateApplicationRequest createApplicationRequest);
	public void update(UpdateApplicationRequest updateApplicationRequest);
}
