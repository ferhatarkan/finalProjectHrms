package finalproject.hrms.business.abstracts;

import java.util.List;

import finalproject.hrms.core.utilities.results.DataResult;
import finalproject.hrms.entities.concretes.User;

public interface UserService {
	DataResult<List<User>> getAll();
}
