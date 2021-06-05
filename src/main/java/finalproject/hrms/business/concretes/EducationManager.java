package finalproject.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import finalproject.hrms.business.abstracts.EducationService;
import finalproject.hrms.core.utilities.results.DataResult;
import finalproject.hrms.core.utilities.results.ErrorDataResult;
import finalproject.hrms.core.utilities.results.ErrorResult;
import finalproject.hrms.core.utilities.results.Result;
import finalproject.hrms.core.utilities.results.SuccessDataResult;
import finalproject.hrms.core.utilities.results.SuccessResult;
import finalproject.hrms.dataAccess.abstracts.EducationDao;
import finalproject.hrms.entities.concretes.Education;
@Service
public class EducationManager implements EducationService{

	private EducationDao educationDao;

	@Autowired
	public EducationManager(EducationDao educationDao) {
		super();
		this.educationDao = educationDao;
	}
	
	 @Override
	    public Result deleteEducation(int educationId) {
	        if(!this.educationDao.existsById(educationId)){
	            return new ErrorResult("Böyle bir okul yok");
	        }
	        this.educationDao.deleteById(educationId);
	        return new SuccessResult("Okul silindi");
	    }
	 
		@Override
	    public DataResult<List<Education>> getByCvId(int cvId) {
	        if(this.educationDao.getByCvId(cvId)==null){
	            return new ErrorDataResult<List<Education>>("Böyle bir cv yok");
	        }
	        return new SuccessDataResult<List<Education>>(this.educationDao.getByCvId(cvId),"Data listelendi");
	    }
}
