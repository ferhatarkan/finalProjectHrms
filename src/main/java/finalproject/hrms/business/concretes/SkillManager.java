package finalproject.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import finalproject.hrms.business.abstracts.CvService;
import finalproject.hrms.business.abstracts.SkillService;
import finalproject.hrms.core.utilities.results.DataResult;
import finalproject.hrms.core.utilities.results.ErrorDataResult;
import finalproject.hrms.core.utilities.results.ErrorResult;
import finalproject.hrms.core.utilities.results.Result;
import finalproject.hrms.core.utilities.results.SuccessDataResult;
import finalproject.hrms.core.utilities.results.SuccessResult;
import finalproject.hrms.dataAccess.abstracts.SkillDao;
import finalproject.hrms.entities.concretes.Skill;
@Service
public class SkillManager implements SkillService{

	private SkillDao skillDao;
	private CvService cvService;

	@Autowired
	public SkillManager(SkillDao skillDao,CvService cvService) {
		super();
		this.skillDao = skillDao;
		this.cvService = cvService;
	}
	
	 @Override
	    public Result deleteSkill(int skillId) {
	        if(!this.skillDao.existsById(skillId)){
	            return new ErrorResult("Böyle bir teknoloji yok");
	        }
	        this.skillDao.deleteById(skillId);
	        return new SuccessResult("Silindi");
	    }

		@Override
	    public DataResult<List<Skill>> getByCvId(int cvId) {
	        if(!this.cvService.getByCvId(cvId).isSuccess()){
	            return new ErrorDataResult<List<Skill>>("Böyle bir cv yok");
	        }

	        return new SuccessDataResult<List<Skill>>(this.skillDao.findByCvId(cvId),"Data listelendi");
	    }
}
