package BitirmeProjesi.freelanceWork.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import BitirmeProjesi.freelanceWork.entities.concretes.Application;
import BitirmeProjesi.freelanceWork.entities.concretes.Job;

public interface ApplicationRepository extends JpaRepository<Application, Integer>{
	List<Application> findByJobId(int jobId);
}
