package finalproject.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import finalproject.hrms.business.abstracts.CvLanguageService;
import finalproject.hrms.core.utilities.results.DataResult;
import finalproject.hrms.core.utilities.results.Result;
import finalproject.hrms.entities.concretes.CvLanguage;

@RestController
@RequestMapping("/api/cvlanguages")
public class CvLanguagesController {
	 private CvLanguageService cvLanguageService;

	    @Autowired
	    public CvLanguagesController(CvLanguageService cvLanguageService) {
	        this.cvLanguageService = cvLanguageService;
	    }

	    @DeleteMapping("/deleteLanguage")
	    public Result deleteLanguage(@RequestParam int languageId){
	        return this.cvLanguageService.deleteLanguage(languageId);
	    }

	    @GetMapping("/getByCvId")
	    public DataResult<List<CvLanguage>> getByCvId(@RequestParam int cvId){
	        return this.cvLanguageService.getByCvId(cvId);
	    }
}
