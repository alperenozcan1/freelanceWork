package BitirmeProjesi.freelanceWork.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import BitirmeProjesi.freelanceWork.business.abstracts.JobService;
import BitirmeProjesi.freelanceWork.business.requests.CreateJobRequest;
import BitirmeProjesi.freelanceWork.business.requests.UpdateJobRequest;
import BitirmeProjesi.freelanceWork.business.responses.GetAllJobsResponse;
import BitirmeProjesi.freelanceWork.business.responses.GetByEmployerIdJobsResponse;
import BitirmeProjesi.freelanceWork.business.responses.GetByIdJobResponse;
import BitirmeProjesi.freelanceWork.business.responses.GetByNameJobResponse;
import BitirmeProjesi.freelanceWork.core.utilities.mappers.ModelMapperService;
import BitirmeProjesi.freelanceWork.dataAccess.abstracts.JobRepository;
import BitirmeProjesi.freelanceWork.entities.concretes.Job;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class JobManager implements JobService {

	private JobRepository jobRepository;
	private ModelMapperService modelMapperService;

	@Override
	public List<GetAllJobsResponse> getAll() {
		List<Job> jobs = jobRepository.findAll();

		List<GetAllJobsResponse> jobsResponse = jobs.stream()
				.map(job -> this.modelMapperService.forResponse().map(job, GetAllJobsResponse.class))
				.collect(Collectors.toList());

		return jobsResponse;
	}

	@Override
	public void add(CreateJobRequest createJobRequest) {
		
		Job job = this.modelMapperService.forRequest().map(createJobRequest, Job.class);
		this.jobRepository.save(job);

	} 

	@Override
	public void update(UpdateJobRequest updateJobRequest) {
		Job job = this.modelMapperService.forRequest().map(updateJobRequest, Job.class);
		this.jobRepository.save(job);

	}

	@Override
	public void delete(int id) {
		this.jobRepository.deleteById(id);
		;

	}

	@Override
	public GetByIdJobResponse getById(int id) {
		Job job=this.jobRepository.findById(id).orElseThrow();
		GetByIdJobResponse response=
				this.modelMapperService.forResponse()
				.map(job, GetByIdJobResponse.class);
		
		return response;
	}

	@Override
	public List<GetByNameJobResponse> getByName(String name) {
		List<Job> jobs=this.jobRepository.findByName(name);
		List<GetByNameJobResponse> jobsResponse = jobs.stream()
				.map(job -> this.modelMapperService.forResponse().map(job, GetByNameJobResponse.class))
				.collect(Collectors.toList());
		
		return jobsResponse;
	}

	@Override
	public List<GetByEmployerIdJobsResponse> getByEmployerId(int employerId) {
		List<Job> jobs=this.jobRepository.findByEmployerId(employerId);
		  List<GetByEmployerIdJobsResponse>
		  jobsResponse=jobs.stream().map(job->this.modelMapperService.forResponse().map
		  (job, GetByEmployerIdJobsResponse.class)).collect(Collectors.toList());
		  return jobsResponse;
	}

	/*
	 * @Override public List<GetByEmployerIdJobsResponse> getByEmployerId(int
	 * employerId) { List<Job> jobs=this.jobRepository.findByEmployerId(employerId);
	 * List<GetByEmployerIdJobsResponse>
	 * jobsResponse=jobs.stream().map(job->this.modelMapperService.forResponse().map
	 * (job, GetByEmployerIdJobsResponse.class)).collect(Collectors.toList());
	 * return jobsResponse; }
	 */
	

	


}
