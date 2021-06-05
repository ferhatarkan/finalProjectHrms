package finalproject.hrms.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import finalproject.hrms.core.utilities.results.DataResult;
import finalproject.hrms.core.utilities.results.Result;
import finalproject.hrms.entities.concretes.JobAdvertisement;
import finalproject.hrms.entities.dtos.JobAdvertisementDto;

public interface JobAdvertisementService {
	DataResult<List<JobAdvertisement>>  getAll();
	Result add(JobAdvertisement jobAdvertisement);
	DataResult<List<JobAdvertisement>> getByJobDescription(String jobDescription);
	DataResult<List<JobAdvertisement>> getByIsActive(Boolean isActive);
	DataResult<List<JobAdvertisementDto>>  getJobAdvertisementDetailsByIsActive(Boolean isActive);
	DataResult<List<JobAdvertisementDto>>  getJobAdvertisementOrderByApplyDateAsc(Boolean isActive);
	DataResult<List<JobAdvertisementDto>>  getJobAdvertisementDetailsWithCompanyName(String companyName, Boolean isActive);
	Result updateIsActiveAndEmployeerId(int id, int employerId);
}
