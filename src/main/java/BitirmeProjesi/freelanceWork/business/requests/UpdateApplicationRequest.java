package BitirmeProjesi.freelanceWork.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateApplicationRequest {
	private int id;
	private String details;
	private boolean situation;
	private int jobId;
	private int employeeId;
}
