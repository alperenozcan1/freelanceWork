package BitirmeProjesi.freelanceWork.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetByIdJobResponse {
	private int id;
	private String name;
	private double price;
	private String description;
	private String employerName;
}
