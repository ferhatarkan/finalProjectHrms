package finalproject.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import finalproject.hrms.business.abstracts.CvLanguageService;
import finalproject.hrms.business.abstracts.CvService;
import finalproject.hrms.core.utilities.results.DataResult;
import finalproject.hrms.core.utilities.results.ErrorDataResult;
import finalproject.hrms.core.utilities.results.ErrorResult;
import finalproject.hrms.core.utilities.results.Result;
import finalproject.hrms.core.utilities.results.SuccessDataResult;
import finalproject.hrms.core.utilities.results.SuccessResult;
import finalproject.hrms.dataAccess.abstracts.CvLanguageDao;
import finalproject.hrms.entities.concretes.CvLanguage;

@Service
public class CvLanguageManager implements CvLanguageService{
	 	private CvLanguageDao cvLanguageDao;
	    private CvService cvService;

	    @Autowired
	    public CvLanguageManager(CvLanguageDao cvLanguageDao,CvService cvService) {
	        this.cvLanguageDao = cvLanguageDao;
	        this.cvService=cvService;
	    }

	    @Override
	    public Result deleteLanguage(int languageId) {
	        if(!this.cvLanguageDao.existsById(languageId)){
	            return new ErrorResult("Böyle bir dil bulunamadı");
	        }
	        this.cvLanguageDao.deleteById(languageId);
	        return new SuccessResult("Silindi");
	    }

	    @Override
	    public DataResult<List<CvLanguage>> getByCvId(int cvId) {
	        if(this.cvService.getByCvId(cvId)==null){
	            return new ErrorDataResult<List<CvLanguage>>("Böyle bir cv yok");
	        }
	        return new SuccessDataResult<List<CvLanguage>>(this.cvLanguageDao.getByCvId(cvId),"Listelendi");
	    }
}
