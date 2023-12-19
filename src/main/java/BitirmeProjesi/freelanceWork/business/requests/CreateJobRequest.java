package BitirmeProjesi.freelanceWork.business.requests;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateJobRequest {
	@NotNull
	private String name;
	private double price;
	private String description;
	@NotNull
	private int employerId;
	
}
