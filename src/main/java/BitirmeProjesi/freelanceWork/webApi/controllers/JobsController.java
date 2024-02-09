package BitirmeProjesi.freelanceWork.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import BitirmeProjesi.freelanceWork.business.abstracts.JobService;
import BitirmeProjesi.freelanceWork.business.requests.CreateJobRequest;
import BitirmeProjesi.freelanceWork.business.requests.UpdateJobRequest;
import BitirmeProjesi.freelanceWork.business.responses.GetAllJobsResponse;
import BitirmeProjesi.freelanceWork.business.responses.GetByEmployerIdJobsResponse;
import BitirmeProjesi.freelanceWork.business.responses.GetByIdJobResponse;
import BitirmeProjesi.freelanceWork.business.responses.GetByNameJobResponse;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/jobs")
@AllArgsConstructor
@CrossOrigin
public class JobsController {
	private JobService jobService;
	@GetMapping("/getall")
	 public List<GetAllJobsResponse> getAll(){
    	return jobService.getAll();
    }
	
	@GetMapping("/{id}")
   public GetByIdJobResponse getById(@PathVariable int id){
    	return jobService.getById(id);
    }
	@GetMapping("/getByName")
	public List<GetByNameJobResponse> getByName(@RequestParam("name") String name) {
		return jobService.getByName(name);
	}
	
	@PostMapping("/add")
	public void add( CreateJobRequest createJobRequest) {
		this.jobService.add(createJobRequest);
	}
	
	@PutMapping("/update")
	public void update( UpdateJobRequest updateJobRequest) {
		this.jobService.update(updateJobRequest);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		this.jobService.delete(id);
	}
	@GetMapping("/getByEmployerId")
		public List<GetByEmployerIdJobsResponse> getByEmployerId(@RequestParam("employerId")int employerId){
		return jobService.getByEmployerId(employerId);
	}
		
	}

