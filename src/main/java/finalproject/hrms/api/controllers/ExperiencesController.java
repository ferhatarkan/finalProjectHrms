package finalproject.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import finalproject.hrms.business.abstracts.ExperienceService;
import finalproject.hrms.core.utilities.results.DataResult;
import finalproject.hrms.core.utilities.results.Result;
import finalproject.hrms.entities.concretes.Experience;

@RestController
@RequestMapping("/api/experiences")
public class ExperiencesController {

	private ExperienceService experienceService;

	@Autowired
	public ExperiencesController(ExperienceService experienceService) {
		super();
		this.experienceService = experienceService;
	}
	
	@DeleteMapping("/delete")
    public Result delete(@RequestParam int experienceId){
        return this.experienceService.delete(experienceId);
    }

    @GetMapping("/getByCvId")
    public DataResult<List<Experience>> getByCvId(@RequestParam int id){
        return this.experienceService.getByCvId(id);
    }
}
