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

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="job_advertisements")
public class JobAdvertisement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	//@Column(name="city_id")
	//private int cityId;
	
	@Column(name="job_description")
	private String jobDescription;
	
	@Column(name="min_salary")
	private Double minSalary;
	
	@Column(name="max_salary")
	private Double maxSalary;
	
	@Column(name="open_position_count")
	private int openPositionCount;
	
	@Column(name="last_apply_date")
	private LocalDate lastApplyDate;
	
	@Column(name="apply_date")
	private LocalDate applyDate;
	
	@Column(name="is_active")
	private Boolean isActive;
	
	@ManyToOne
	@JoinColumn(name="city_id")
	private City city;
	
	@ManyToOne
	@JoinColumn(name="job_position_id")
	private JobPosition jobPosition;
	
	@ManyToOne
	@JoinColumn(name="employer_id")
	private Employer employer;
}
