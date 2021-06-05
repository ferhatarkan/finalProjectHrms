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
@Entity
@Table(name="experiences")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler","cv"})
public class Experience {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	@Column(name="id")
	private int id;
	
	//@Column(name = "cv_id")
	//private int cvId;
	
	@Column(name="workplace_name", nullable=false)
	private String workplaceName;
	
	@Column(name="job_title", nullable=false)
	private String jobTitle;
	
	@Column(name="start_date", nullable=false)
	private LocalDate startDate;
	
	@Column(name="departure_date")
	private LocalDate departureDate;
	
	@ManyToOne()
	@JoinColumn(name = "cv_id")
	private Cv cv;
}
