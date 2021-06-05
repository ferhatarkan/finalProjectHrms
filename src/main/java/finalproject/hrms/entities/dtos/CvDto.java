package finalproject.hrms.entities.dtos;

import java.util.List;

import finalproject.hrms.entities.concretes.CvLanguage;
import finalproject.hrms.entities.concretes.Education;
import finalproject.hrms.entities.concretes.Experience;
import finalproject.hrms.entities.concretes.Image;
import finalproject.hrms.entities.concretes.JobSeeker;
import finalproject.hrms.entities.concretes.Skill;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CvDto {
	
	private int id;
	
	private String github;
	
	private String linkedin;
	
	private String summary;

	private JobSeeker jobSeeker;

	private List<CvLanguage> languages;

	private List<Education> educations;

	private List<Experience> experiences;

	private List<Skill> skills;

	private List<Image> images;

}
