package BitirmeProjesi.freelanceWork.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateEmployerRequest {
	private int id;
	private String name;
	private String country;
	private String information;
}
