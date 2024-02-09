package BitirmeProjesi.freelanceWork.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import BitirmeProjesi.freelanceWork.business.abstracts.EmployerService;
import BitirmeProjesi.freelanceWork.business.requests.CreateEmployerRequest;
import BitirmeProjesi.freelanceWork.business.requests.UpdateEmployerRequest;
import BitirmeProjesi.freelanceWork.business.responses.GetAllEmployersResponse;
import BitirmeProjesi.freelanceWork.core.utilities.mappers.ModelMapperService;
import BitirmeProjesi.freelanceWork.dataAccess.abstracts.EmployerRepository;
import BitirmeProjesi.freelanceWork.entities.concretes.Employer;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployerManager implements EmployerService{
	
	private EmployerRepository employerRepository;
	private ModelMapperService modelMapperService;
	
	@Override
	public void add(CreateEmployerRequest createEmployerRequest) {
		Employer employer = this.modelMapperService.forRequest().map(createEmployerRequest, Employer.class);
		this.employerRepository.save(employer);
		
	}

	@Override
	public void update(UpdateEmployerRequest updateEmployerRequest) {
		Employer employer = this.modelMapperService.forRequest().map(updateEmployerRequest, Employer.class);
		this.employerRepository.save(employer);
		
	}

	@Override
	public void delete(int id) {
		this.employerRepository.deleteById(id);
	}

	@Override
	public List<GetAllEmployersResponse> getAll() {
		List<Employer> employers = employerRepository.findAll();

		List<GetAllEmployersResponse> employersResponse = employers.stream()
				.map(employer -> this.modelMapperService.forResponse().map(employer, GetAllEmployersResponse.class))
				.collect(Collectors.toList());

		return employersResponse;
	}

	

}
