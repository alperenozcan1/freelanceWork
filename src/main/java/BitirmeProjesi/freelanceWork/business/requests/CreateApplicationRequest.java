package BitirmeProjesi.freelanceWork.business.requests;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateApplicationRequest {
	private String message;
	private int employeeId;
	private int jobId;
}
