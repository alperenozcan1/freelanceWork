package BitirmeProjesi.freelanceWork.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import BitirmeProjesi.freelanceWork.business.abstracts.ApplicationService;
import BitirmeProjesi.freelanceWork.business.requests.CreateApplicationRequest;
import BitirmeProjesi.freelanceWork.business.responses.GetAllApplicationsResponse;
import BitirmeProjesi.freelanceWork.business.responses.GetByEmployerIdJobsResponse;
import BitirmeProjesi.freelanceWork.business.responses.GetByJobIdApplicationResponse;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/applications")
@AllArgsConstructor
@CrossOrigin
public class ApplicationsController {
	private ApplicationService applicationService;
	@PostMapping("/add")
	public void add(CreateApplicationRequest createApplicationRequest) {
		this.applicationService.add(createApplicationRequest);
	}
	@GetMapping("/getall")
	 public List<GetAllApplicationsResponse> getAll(){
   	return applicationService.getAll();
   }
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		this.applicationService.delete(id);
	}
	@GetMapping("/getByJobIdApplication")
		public List<GetByJobIdApplicationResponse> getByJobIdApplication(@RequestParam("jobId")int jobId){
			return applicationService.getByJobIdApplication(jobId);
	}
}
