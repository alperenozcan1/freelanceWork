package BitirmeProjesi.freelanceWork.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import BitirmeProjesi.freelanceWork.entities.concretes.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
