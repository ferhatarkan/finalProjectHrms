package finalproject.hrms.business.abstracts;

import java.util.List;

import finalproject.hrms.core.utilities.results.DataResult;
import finalproject.hrms.core.utilities.results.Result;
import finalproject.hrms.entities.concretes.Education;

public interface EducationService {

	Result deleteEducation(int educationId);

	DataResult<List<Education>> getByCvId(int cvId);

}
