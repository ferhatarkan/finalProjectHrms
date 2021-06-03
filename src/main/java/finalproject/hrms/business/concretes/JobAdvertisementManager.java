package finalproject.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import finalproject.hrms.business.abstracts.JobAdvertisementService;
import finalproject.hrms.core.utilities.results.DataResult;
import finalproject.hrms.core.utilities.results.ErrorResult;
import finalproject.hrms.core.utilities.results.Result;
import finalproject.hrms.core.utilities.results.SuccessDataResult;
import finalproject.hrms.core.utilities.results.SuccessResult;
import finalproject.hrms.dataAccess.abstracts.JobAdvertisementDao;
import finalproject.hrms.entities.concretes.JobAdvertisement;
import finalproject.hrms.entities.dtos.JobAdvertisementDto;

@Service
public class JobAdvertisementManager implements JobAdvertisementService {
	private JobAdvertisementDao jobAdvertisementDao;

	@Autowired
	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
		super();
		this.jobAdvertisementDao = jobAdvertisementDao;
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAll() {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findAll(), "Data listelendi");
	}

	public Result add(JobAdvertisement jobAdvertisement) {
		if (checkAllFieldsControl(jobAdvertisement) == false) {

			return new ErrorResult("Tüm Alanlar Zorunludur.");
		} else {
			this.jobAdvertisementDao.save(jobAdvertisement);
			return new SuccessDataResult<>("İş İlanı Başarıyla Eklendi.");
		}
	}

	private boolean checkAllFieldsControl(JobAdvertisement jobAdvertisement) {

		if (jobAdvertisement.getJobDescription().isEmpty() || jobAdvertisement.getOpenPositionCount() == 0
				|| jobAdvertisement.getLastApplyDate() == null) {

			return false;
		}
		return true;
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByJobDescription(String jobDescription) {
		return new SuccessDataResult<List<JobAdvertisement>>(
				this.jobAdvertisementDao.getByJobDescription(jobDescription), "Job description listelendi");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByIsActive(Boolean isActive) {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getByIsActive(isActive),
				"Data listelendi");

	}

	@Override
	public DataResult<List<JobAdvertisementDto>> getJobAdvertisementDetailsByIsActive(Boolean isActive) {
		return new SuccessDataResult<List<JobAdvertisementDto>>(this.jobAdvertisementDao.getJobAdvertisementDetailsByIsActive(isActive), "ilanları listelendi");
	}

	@Override
	public DataResult<List<JobAdvertisementDto>> getJobAdvertisementOrderByApplyDateAsc(Boolean isActive) {
		return new SuccessDataResult<List<JobAdvertisementDto>>(this.jobAdvertisementDao.getJobAdvertisementOrderByApplyDateAsc(isActive));
	}

	@Override
	public DataResult<List<JobAdvertisementDto>> getJobAdvertisementDetailsWithCompanyName(String companyName,
			Boolean isActive) {
		return new SuccessDataResult<List<JobAdvertisementDto>>(this.jobAdvertisementDao.getJobAdvertisementDetailsWithCompanyName(companyName, isActive),"Data listelendi");
	}

	@Override
	public Result updateIsActiveAndEmployeerId(int id, int employerId) {
		this.jobAdvertisementDao.updateIsActiveAndEmployeerId(id, employerId);
		return new SuccessResult("İlan pasife çevirildi.");
	}

}
