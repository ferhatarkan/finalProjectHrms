package finalproject.hrms.business.abstracts;

import java.util.List;

import finalproject.hrms.core.utilities.results.DataResult;
import finalproject.hrms.entities.concretes.SystemEmployee;


public interface SystemEmployeeService {
	DataResult<List<SystemEmployee>> getAll();
}
