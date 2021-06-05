package finalproject.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import finalproject.hrms.business.abstracts.EducationService;
import finalproject.hrms.core.utilities.results.DataResult;
import finalproject.hrms.core.utilities.results.Result;
import finalproject.hrms.entities.concretes.Education;

@RestController
@RequestMapping("/api/educations")
public class EducationsController {

	@Autowired
	private EducationService educationService;

	public EducationsController(EducationService educationService) {
		super();
		this.educationService = educationService;
	}
	
	@DeleteMapping("/deleteeducations")
    public Result deleteSchool(@RequestParam int educationId){
        return this.educationService.deleteEducation(educationId);
    }

    @GetMapping("/getByCvId")
    public DataResult<List<Education>> getByCvId(@RequestParam int cvId){
        return this.educationService.getByCvId(cvId);
    }
}
