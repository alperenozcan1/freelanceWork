package BitirmeProjesi.freelanceWork.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateEmployeeRequest {
	private int id;
	private String name;
	private String country;
	private String information;
	private int experienceYear;
	private String abilities;
	private String email;
	private String password;

}
