package finalproject.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import finalproject.hrms.business.abstracts.CvService;
import finalproject.hrms.core.utilities.results.DataResult;
import finalproject.hrms.core.utilities.results.ErrorDataResult;
import finalproject.hrms.core.utilities.results.ErrorResult;
import finalproject.hrms.core.utilities.results.Result;
import finalproject.hrms.core.utilities.results.SuccessDataResult;
import finalproject.hrms.core.utilities.results.SuccessResult;
import finalproject.hrms.dataAccess.abstracts.CvDao;
import finalproject.hrms.entities.concretes.Cv;
@Service
public class CvManager implements CvService{

	private CvDao cvDao;
	@Autowired
	public CvManager(CvDao cvDao) {
		super();
		this.cvDao = cvDao;
	}

	@Override
    public DataResult<List<Cv>> getAll() {
        return new SuccessDataResult<List<Cv>>(this.cvDao.findAll(),"Data listelendi");
    }
	

	@Override
    public DataResult<Cv> getByCvId(int cvId) {
        if(!this.cvDao.existsById(cvId)){
            return new ErrorDataResult<Cv>("Bu cvId sine sahip bir cv yok");
        }
        return new SuccessDataResult<Cv>(this.cvDao.getOne(cvId),"Data listelendi");
    }

	
	@Override
	public DataResult<Cv> getByUserId(int id) {
		if (this.cvDao.getByUserId(id) == null) {
			return new ErrorDataResult<Cv>("Bu user id sine sahip Cv yok");
		}
		return new SuccessDataResult<Cv>(this.cvDao.getByUserId(id),"Data listelendi.");
	}
	
	@Override
	    public Result updateGithub(String github, int cvId) {

	        if(!this.cvDao.existsById(cvId)){
	            return new ErrorResult("Bu cvId sine sahip bir cv yok");
	        }else if(!github.startsWith("https://github.com")){
	            if(!github.startsWith("github.com")){
	                return new ErrorResult("Geçerli bir github linki değil");
	            }
	        }

	        Cv cv = this.cvDao.getOne(cvId);
	        cv.setGithub(github);
	        this.cvDao.save(cv);
	        return new SuccessResult("Kaydedildi");
	    }

		@Override
	    public Result deleteGithub(int cvId) {
	        if(!this.cvDao.existsById(cvId)){
	            return new ErrorResult("Bu cvId sine sahip bir cv yok");
	        }
	        Cv cv = this.cvDao.getOne(cvId);
	        cv.setGithub(null);
	        return new SuccessResult("Github adresi silindi");
	    }

		@Override
	    public Result updateLinkedin(String linkedin, int cvId) {
	        if(!this.cvDao.existsById(cvId)){
	            return new ErrorResult("Böyle bir cv yok");
	        }else if(!linkedin.startsWith("https://www.linkedin.com") &&
	                !linkedin.startsWith("www.linkedin.com") &&
	                !linkedin.startsWith("https://linkedin.com") &&
	                !linkedin.startsWith("linkedin.com")){
	            return new ErrorResult("Geçerli bir linked in adresi değil");
	        }
	        Cv cv = this.cvDao.getOne(cvId);
	        cv.setLinkedin(linkedin);
	        this.cvDao.save(cv);
	        return new SuccessResult("Kaydedildi");
	    }

		@Override
	    public Result deleteLinkedin(int cvId) {
	        if(!this.cvDao.existsById(cvId)){
	            return new ErrorResult("Bu cvId sine sahip bir cv yok");
	        }
	        Cv cv = this.cvDao.getOne(cvId);
	        cv.setLinkedin(null);
	        this.cvDao.save(cv);
	        return new SuccessResult("Linkedin adresi silindi");
	    }

		@Override
	    public Result updateSummary(String summary, int cvId) {
	        if(!this.cvDao.existsById(cvId)){
	            return new ErrorResult("Bu cvId sine sahip bir cv yok");
	        }else if(summary.length()<=2){
	            return new ErrorResult("Summary 2 karakterden uzun olmalıdır");
	        }
	        Cv cv = this.cvDao.getOne(cvId);
	        cv.setSummary(summary);
	        this.cvDao.save(cv);
	        return new SuccessResult("Summary kaydedildi");
	    }

		@Override
	    public Result deleteSummary(int cvId) {
	        if(!this.cvDao.existsById(cvId)){
	            return new ErrorResult("Bu cvId sine sahip bir cv yok");
	        }
	        Cv cv = this.cvDao.getOne(cvId);
	        cv.setSummary(null);
	        this.cvDao.save(cv);
	        return new SuccessResult("Summary silindi");
	    }
}
