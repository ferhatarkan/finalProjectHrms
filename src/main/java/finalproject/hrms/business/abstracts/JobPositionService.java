package finalproject.hrms.business.abstracts;

import java.util.List;

import finalproject.hrms.entities.concretes.JobPosition;

public interface JobPositionService {
	List<JobPosition> getAll();
}
