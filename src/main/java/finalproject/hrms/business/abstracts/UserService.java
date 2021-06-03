package finalproject.hrms.business.abstracts;

import java.util.List;

import finalproject.hrms.core.entities.User;
import finalproject.hrms.core.utilities.results.DataResult;


public interface UserService {
	DataResult<List<User>> getAll();
}
