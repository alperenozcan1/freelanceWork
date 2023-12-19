package BitirmeProjesi.freelanceWork.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import BitirmeProjesi.freelanceWork.entities.concretes.Job;

public interface JobRepository extends JpaRepository<Job, Integer>{
	List<Job> findByName(String name);
	
}
