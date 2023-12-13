package BitirmeProjesi.freelanceWork.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import BitirmeProjesi.freelanceWork.entities.concretes.Employer;

public interface EmployerRepository extends JpaRepository<Employer, Integer>{

}
