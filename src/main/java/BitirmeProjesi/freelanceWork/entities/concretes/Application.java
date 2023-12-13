package BitirmeProjesi.freelanceWork.entities.concretes;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="applications")
public class Application {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String details;
	private boolean situation;//true onaylandı--false reddedildi
}
