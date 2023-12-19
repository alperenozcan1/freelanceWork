package BitirmeProjesi.freelanceWork.business.concretes;

import org.springframework.stereotype.Service;

import BitirmeProjesi.freelanceWork.business.abstracts.ApplicationService;
import BitirmeProjesi.freelanceWork.business.requests.CreateApplicationRequest;
import BitirmeProjesi.freelanceWork.business.requests.UpdateApplicationRequest;
import BitirmeProjesi.freelanceWork.core.utilities.mappers.ModelMapperService;
import BitirmeProjesi.freelanceWork.dataAccess.abstracts.ApplicationRepository;
import BitirmeProjesi.freelanceWork.entities.concretes.Application;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ApplicationManager implements ApplicationService{
	private ApplicationRepository applicationRepository;
    private ModelMapperService modelMapperService;
    
    @Override
	public void add(@Valid() CreateApplicationRequest createApplicationRequest) {
    	Application application = this.modelMapperService.forRequest().map(createApplicationRequest, Application.class);
		this.applicationRepository.save(application);
		
	}

	@Override
	public void update(UpdateApplicationRequest updateApplicationRequest) {
		Application application=this.modelMapperService.forRequest().map(updateApplicationRequest, Application.class);
		this.applicationRepository.save(application);
		
	}
}
