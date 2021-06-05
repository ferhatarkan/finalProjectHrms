package finalproject.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import finalproject.hrms.business.abstracts.ExperienceService;
import finalproject.hrms.core.utilities.results.DataResult;
import finalproject.hrms.core.utilities.results.ErrorResult;
import finalproject.hrms.core.utilities.results.Result;
import finalproject.hrms.core.utilities.results.SuccessDataResult;
import finalproject.hrms.core.utilities.results.SuccessResult;
import finalproject.hrms.dataAccess.abstracts.ExperienceDao;
import finalproject.hrms.entities.concretes.Experience;
@Service
public class ExperienceManager implements ExperienceService{

	private ExperienceDao experienceDao;

	@Autowired
	public ExperienceManager(ExperienceDao experienceDao) {
		super();
		this.experienceDao = experienceDao;
	}
	
	@Override
	    public Result delete(int experienceId) {
	        if(!this.experienceDao.existsById(experienceId)){
	            return new ErrorResult("Böyle bir experiance yok");
	        }
	        this.experienceDao.deleteById(experienceId);
	        return new SuccessResult("Silindi");
	    }

	    @Override
	    public DataResult<List<Experience>> getByCvId(int id) {

	        return new SuccessDataResult<List<Experience>>(this.experienceDao.getByCvId(id),"Data listelendi");
	    }
}
