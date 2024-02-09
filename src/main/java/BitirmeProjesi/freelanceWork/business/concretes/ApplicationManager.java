package BitirmeProjesi.freelanceWork.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import BitirmeProjesi.freelanceWork.business.abstracts.ApplicationService;
import BitirmeProjesi.freelanceWork.business.requests.CreateApplicationRequest;
import BitirmeProjesi.freelanceWork.business.responses.GetAllApplicationsResponse;
import BitirmeProjesi.freelanceWork.business.responses.GetByEmployerIdJobsResponse;
import BitirmeProjesi.freelanceWork.business.responses.GetByJobIdApplicationResponse;
import BitirmeProjesi.freelanceWork.core.utilities.mappers.ModelMapperService;
import BitirmeProjesi.freelanceWork.dataAccess.abstracts.ApplicationRepository;
import BitirmeProjesi.freelanceWork.entities.concretes.Application;
import BitirmeProjesi.freelanceWork.entities.concretes.Job;
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
	@Override
	public List<GetAllApplicationsResponse> getAll() {
		List<Application> applications = applicationRepository.findAll();

		List<GetAllApplicationsResponse> applicationsResponse = applications.stream()
				.map(application -> this.modelMapperService.forResponse().map(application, GetAllApplicationsResponse.class))
				.collect(Collectors.toList());

		return applicationsResponse;
	}
	@Override
	public void delete(int id) {
		this.applicationRepository.deleteById(id);
	}
	@Override
	public List<GetByJobIdApplicationResponse> getByJobIdApplication(int jobId) {
		List<Application> applications=this.applicationRepository.findByJobId(jobId);
		  List<GetByJobIdApplicationResponse>
		  applicationsResponse=applications.stream().map(application->this.modelMapperService.forResponse().map
		  (application, GetByJobIdApplicationResponse.class)).collect(Collectors.toList());
		  return applicationsResponse;
	}

}
//public GetByIdJobResponse getById(int id) {
//	Job job=this.jobRepository.findById(id).orElseThrow();
//	GetByIdJobResponse response=
//			this.modelMapperService.forResponse()
//			.map(job, GetByIdJobResponse.class);
//	
//	return response;
//}