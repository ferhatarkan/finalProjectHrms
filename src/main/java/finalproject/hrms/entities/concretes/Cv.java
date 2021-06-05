package finalproject.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cvs")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cv {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    
    @Column(name = "user_id")
	private int userId;

    @Column(name = "github")
    private String github;

    @Column(name = "linkedin")
    private String linkedin;

    @Column(name = "summary")
    private String summary;

    @OneToMany(mappedBy = "cv")
    private List<Image> images;
    
    @OneToMany(mappedBy = "cv")
    private List<CvLanguage> cvLanguages;
    
    @OneToMany(mappedBy = "cv")
    private List<Education> educations;
    
    @OneToMany(mappedBy = "cv")
    private List<Experience> experiences;
    
    @OneToMany(mappedBy = "cv")
    private List<Skill> skills;

}
