package BitirmeProjesi.freelanceWork.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateJobRequest {
	private int id;
	private String name;
	private double price;
	private String description;
	private int employerId;
}
