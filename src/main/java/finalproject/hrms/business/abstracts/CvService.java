package finalproject.hrms.business.abstracts;

import java.util.List;

import finalproject.hrms.core.utilities.results.DataResult;
import finalproject.hrms.core.utilities.results.Result;
import finalproject.hrms.entities.concretes.Cv;

public interface CvService {
	DataResult<Cv> getByUserId(int id);

	DataResult<List<Cv>> getAll();

	DataResult<Cv> getByCvId(int cvId);

	Result updateGithub(String github, int cvId);

	Result deleteGithub(int cvId);

	Result updateLinkedin(String linkedin, int cvId);

	Result deleteLinkedin(int cvId);

	Result updateSummary(String summary, int cvId);

	Result deleteSummary(int cvId);
}
