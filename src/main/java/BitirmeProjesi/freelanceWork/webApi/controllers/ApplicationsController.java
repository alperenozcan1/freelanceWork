package BitirmeProjesi.freelanceWork.webApi.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import BitirmeProjesi.freelanceWork.business.abstracts.ApplicationService;
import BitirmeProjesi.freelanceWork.business.requests.CreateApplicationRequest;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/applications")
@AllArgsConstructor
public class ApplicationsController {
	private ApplicationService applicationService;
	@PostMapping()
	public void add(CreateApplicationRequest createApplicationRequest) {
		this.applicationService.add(createApplicationRequest);
	}
}
