package finalproject.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import finalproject.hrms.business.abstracts.CvService;
import finalproject.hrms.core.utilities.results.DataResult;
import finalproject.hrms.core.utilities.results.Result;
import finalproject.hrms.entities.concretes.Cv;

@RestController
@RequestMapping("/api/cvs")
public class CvsController {
	   private CvService cvService;

	    @Autowired
	    public CvsController(CvService cvService) {
	        this.cvService = cvService;
	    }


	    @GetMapping("/getall")
	    public DataResult<List<Cv>> getAll(){
	        return this.cvService.getAll();
	    }

	    @GetMapping("/getByCvId")
	    public ResponseEntity<?> getByCvId(@RequestParam int cvId){
	        DataResult<Cv> result=this.cvService.getByCvId(cvId);
	        if(result.isSuccess()){
	            return ResponseEntity.ok(result);
	        }
	        return ResponseEntity.badRequest().body(result);
	    }

	    @GetMapping("/getByUserId")
	    public ResponseEntity<?> getByCandidateId(@RequestParam int userId){
	        DataResult<Cv> result=this.cvService.getByUserId(userId);
	        if(result.isSuccess()){
	            return ResponseEntity.ok(result);
	        }
	        return ResponseEntity.badRequest().body(result);
	    }

	    @PostMapping("/updateGithub")
	    public ResponseEntity<?> updateGithub(@RequestParam String github,@RequestParam int cvId){
	        Result result=this.cvService.updateGithub(github,cvId);
	        if(result.isSuccess()){
	            return ResponseEntity.ok(result);
	        }
	        return ResponseEntity.badRequest().body(result);
	    }

	    @PostMapping("/deleteGithub")
	    public ResponseEntity<?> deleteGithub(@RequestParam int cvId){
	        Result result=this.cvService.deleteGithub(cvId);
	        if (result.isSuccess()){
	            return ResponseEntity.ok(result);
	        }
	        return ResponseEntity.badRequest().body(result);
	    }

	    @PostMapping("/updateLinkedin")
	    public ResponseEntity<?> updateLinkedin(@RequestParam String linkedin,@RequestParam int cvId){
	        Result result=this.cvService.updateLinkedin(linkedin, cvId);
	        if(result.isSuccess()){
	            return ResponseEntity.ok(result);
	        }
	        return ResponseEntity.badRequest().body(result);
	    }

	    @PostMapping("/deleteLinkedin")
	    public ResponseEntity<?> deleteLinkedin(@RequestParam int cvId){
	        Result result=this.cvService.deleteLinkedin(cvId);
	        if(result.isSuccess()){
	            return ResponseEntity.ok(result);
	        }
	        return ResponseEntity.badRequest().body(result);
	    }

	    @PostMapping("/updateBiography")
	    public ResponseEntity<?> updateBiography(@RequestParam String biography,@RequestParam int cvId){
	        Result result=this.cvService.updateSummary(biography,cvId);
	        if(result.isSuccess()){
	            return ResponseEntity.ok(result);
	        }
	        return ResponseEntity.badRequest().body(result);
	    }

	    @PostMapping("/deleteBiography")
	    public ResponseEntity<?> deleteBiography(@RequestParam int cvId){
	        Result result=this.cvService.deleteSummary(cvId);
	        if(result.isSuccess()){
	            return ResponseEntity.ok(result);
	        }
	        return ResponseEntity.badRequest().body(result);
	    }
}
