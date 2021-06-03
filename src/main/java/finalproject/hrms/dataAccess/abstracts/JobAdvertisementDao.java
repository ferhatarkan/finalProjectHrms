package finalproject.hrms.dataAccess.abstracts;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import finalproject.hrms.entities.concretes.JobAdvertisement;
import finalproject.hrms.entities.dtos.JobAdvertisementDto;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer>{
	

	List<JobAdvertisement> getByJobDescription(String jobDescription);
	List<JobAdvertisement> getByIsActive(Boolean isActive); 
	
	@Query("Select new finalproject.hrms.entities.dtos.JobAdvertisementDto" + 
			"(e.companyName, jp.name, ja.openPositionCount, ja. applyDate, ja.lastApplyDate)" +
			"From JobAdvertisement ja Inner Join ja.employer e Inner Join ja.jobPosition jp Where ja.isActive=?1")
	List<JobAdvertisementDto> getJobAdvertisementDetailsByIsActive(Boolean isActive);
	
	@Query("Select new finalproject.hrms.entities.dtos.JobAdvertisementDto" + 
			"(e.companyName, jp.name, ja.openPositionCount, ja.applyDate, ja.lastApplyDate)" +
			"From JobAdvertisement ja Inner Join ja.employer e Inner Join ja.jobPosition jp Where ja.isActive=?1 Order By ja.applyDate ASC")
	List<JobAdvertisementDto> getJobAdvertisementOrderByApplyDateAsc(Boolean isActive);
	
	@Query("Select new finalproject.hrms.entities.dtos.JobAdvertisementDto" +
	"(e.companyName, jp.name, ja.openPositionCount, ja.applyDate, ja.lastApplyDate)" +
	"From JobAdvertisement ja Inner Join ja.employer e Inner Join ja.jobPosition jp " +
	"Where e.companyName=:companyName and ja.isActive=:isActive")
	List<JobAdvertisementDto> getJobAdvertisementDetailsWithCompanyName(String companyName, Boolean isActive);
	
	
	@Transactional
	@Modifying
	@Query("UPDATE JobAdvertisement j SET j.isActive = false WHERE j.id =:id AND j.id=:employerId")
	void updateIsActiveAndEmployeerId(int id, int employerId);
 
}


