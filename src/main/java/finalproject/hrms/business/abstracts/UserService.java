package finalproject.hrms.business.abstracts;

import java.util.List;

import finalproject.hrms.entities.concretes.User;

public interface UserService {
	List<User> getAll();
}
