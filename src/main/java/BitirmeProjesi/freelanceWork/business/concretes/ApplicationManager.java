package BitirmeProjesi.freelanceWork.business.concretes;

import org.springframework.stereotype.Service;

import BitirmeProjesi.freelanceWork.business.abstracts.ApplicationService;
import BitirmeProjesi.freelanceWork.business.requests.CreateApplicationRequest;
import BitirmeProjesi.freelanceWork.core.utilities.mappers.ModelMapperService;
import BitirmeProjesi.freelanceWork.dataAccess.abstracts.ApplicationRepository;
import BitirmeProjesi.freelanceWork.entities.concretes.Application;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ApplicationManager implements ApplicationService{
	private ApplicationRepository applicationRepository;
    private ModelMapperService modelMapperService;
    
    @Override
	public void add(CreateApplicationRequest createApplicationRequest) {
    	Application application = this.modelMapperService.forRequest().map(createApplicationRequest, Application.class);
		this.applicationRepository.save(application);
		
	}
}
