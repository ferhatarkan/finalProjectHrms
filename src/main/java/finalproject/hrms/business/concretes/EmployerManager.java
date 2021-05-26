package finalproject.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import finalproject.hrms.business.abstracts.EmployerService;
import finalproject.hrms.core.utilities.results.DataResult;
import finalproject.hrms.core.utilities.results.SuccessDataResult;
import finalproject.hrms.dataAccess.abstracts.EmployerDao;
import finalproject.hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService{
	private EmployerDao employerDao;

	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}

	@Override
	public DataResult<List<Employer>>  getAll() {
		return new SuccessDataResult<List<Employer>>( this.employerDao.findAll());
	}

}
