package finalproject.hrms.business.abstracts;

import java.util.List;

import finalproject.hrms.core.utilities.results.DataResult;
import finalproject.hrms.core.utilities.results.Result;
import finalproject.hrms.entities.concretes.Experience;

public interface ExperienceService {

	DataResult<List<Experience>> getByCvId(int id);

	Result delete(int experienceId);

}
