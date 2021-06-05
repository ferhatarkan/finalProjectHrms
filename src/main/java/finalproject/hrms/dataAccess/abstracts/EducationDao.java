package finalproject.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import finalproject.hrms.entities.concretes.Education;

public interface EducationDao extends JpaRepository<Education, Integer>{
	 List<Education> getByCvId(int id);
}