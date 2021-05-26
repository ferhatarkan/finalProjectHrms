package finalproject.hrms.business.abstracts;

import java.util.List;

import finalproject.hrms.core.utilities.results.DataResult;
import finalproject.hrms.entities.concretes.Employer;


public interface EmployerService {
	DataResult<List<Employer>>  getAll();
}
