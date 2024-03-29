package finalproject.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import finalproject.hrms.business.abstracts.JobPositionService;
import finalproject.hrms.core.utilities.results.DataResult;
import finalproject.hrms.core.utilities.results.SuccessDataResult;
import finalproject.hrms.dataAccess.abstracts.JobPositionDao;
import finalproject.hrms.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService{
	private JobPositionDao jobPositionDao;
	
	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}

	@Override
	public DataResult<List<JobPosition>>  getAll() {
		return new SuccessDataResult<List<JobPosition>>(this.jobPositionDao.findAll()) ;
	}

}
