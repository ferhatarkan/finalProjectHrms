package finalproject.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import finalproject.hrms.business.abstracts.JobSeekerService;
import finalproject.hrms.core.utilities.results.DataResult;
import finalproject.hrms.core.utilities.results.SuccessDataResult;
import finalproject.hrms.dataAccess.abstracts.JobSeekerDao;
import finalproject.hrms.entities.concretes.JobSeeker;

@Service
public class JobSeekerManager implements JobSeekerService{
	private JobSeekerDao jobSeekerDao; 

	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao) {
		super();
		this.jobSeekerDao = jobSeekerDao;
	}

	@Override
	public DataResult<List<JobSeeker>>  getAll() {
		return new SuccessDataResult<List<JobSeeker>>(this.jobSeekerDao.findAll());
	}

}
