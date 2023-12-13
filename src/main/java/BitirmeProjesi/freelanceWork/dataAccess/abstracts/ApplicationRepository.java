package BitirmeProjesi.freelanceWork.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import BitirmeProjesi.freelanceWork.entities.concretes.Application;

public interface ApplicationRepository extends JpaRepository<Application, Integer>{

}
