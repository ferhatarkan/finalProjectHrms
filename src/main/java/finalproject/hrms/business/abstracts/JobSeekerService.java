package finalproject.hrms.business.abstracts;

import java.util.List;

import finalproject.hrms.core.utilities.results.DataResult;
import finalproject.hrms.entities.concretes.JobSeeker;


public interface JobSeekerService {
	DataResult<List<JobSeeker>> getAll();
}
