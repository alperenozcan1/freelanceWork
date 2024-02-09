package BitirmeProjesi.freelanceWork.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetByJobIdApplicationResponse {
	public int id;
	public int jobId;
	public String message;
}
