package finalproject.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import finalproject.hrms.business.abstracts.SystemEmployeeService;
import finalproject.hrms.core.utilities.results.DataResult;
import finalproject.hrms.core.utilities.results.SuccessDataResult;
import finalproject.hrms.dataAccess.abstracts.SystemEmployeeDao;
import finalproject.hrms.entities.concretes.SystemEmployee;

@Service
public class SystemEmployeeManager implements SystemEmployeeService{

	private SystemEmployeeDao systemEmployeeDao;
	
	@Autowired
	public SystemEmployeeManager(SystemEmployeeDao systemEmployeeDao) {
		super();
		this.systemEmployeeDao = systemEmployeeDao;
	}
	@Override
	public DataResult<List<SystemEmployee>> getAll() {
		return new SuccessDataResult<List<SystemEmployee>>(this.systemEmployeeDao.findAll());
	}

}
