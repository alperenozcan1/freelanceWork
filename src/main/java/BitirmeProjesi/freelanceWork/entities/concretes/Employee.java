package BitirmeProjesi.freelanceWork.entities.concretes;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="employees")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="country")
	private String country;
	@Column(name="information")
	private String information;
	@Column(name="experienceYear")
	private int experienceYear;
	@Column(name="abilities")
	private String abilities;
	@Column(name="email")
	private String email;
	@Column(name="password")
	private String password;

	
	@OneToOne
	@JoinColumn(name="job_id")
	private Job job;
	
	@OneToMany(mappedBy = "employee")
	private List<Application> applications;
	
}
