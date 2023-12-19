package BitirmeProjesi.freelanceWork.business.requests;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateApplicationRequest {
	private String details;
	private boolean situation;
	@NotNull
	private int jobId;
	@NotNull
	private int employeeId;
}
