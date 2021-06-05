package finalproject.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import finalproject.hrms.entities.concretes.Cv;

public interface CvDao extends JpaRepository<Cv, Integer>{
	 Cv getByUserId(int id);
}
