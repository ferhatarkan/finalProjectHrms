package finalproject.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="educations")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler","cv"})
public class Education {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	//@Column(name = "cv_id")
	//private int cvId;
	
	@Column(name = "school_name", nullable=false)
	private String schoolName;
	
	@Column(name = "program_name", nullable=false)
	private String programName;
	
	@Column(name = "start_date", nullable=false)
	private LocalDate startDate;
	
	@Column(name = "graduation_date", nullable=true)
	private LocalDate graduationDate;
	
	@ManyToOne()
	@JoinColumn(name = "cv_id")
	private Cv cv;
}
