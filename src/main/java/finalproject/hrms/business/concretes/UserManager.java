package finalproject.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import finalproject.hrms.business.abstracts.UserService;
import finalproject.hrms.core.dataAccess.UserDao;
import finalproject.hrms.core.entities.User;
import finalproject.hrms.core.utilities.results.DataResult;
import finalproject.hrms.core.utilities.results.SuccessDataResult;

@Service
public class UserManager implements UserService{

	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}
	@Override
	public DataResult<List<User>> getAll() {
		return new SuccessDataResult<List<User>>(this.userDao.findAll());
	}

}
