package BitirmeProjesi.freelanceWork.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class GetAllApplicationsResponse {
	private int id;
	private String message;
	private String jobName;
	private String employeeName;
}
