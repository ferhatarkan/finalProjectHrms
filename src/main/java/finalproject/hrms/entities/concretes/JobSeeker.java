package finalproject.hrms.entities.concretes;


import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import finalproject.hrms.core.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Data
@EqualsAndHashCode(callSuper=false)
@Entity
@Table(name = "job_seekers")
@AllArgsConstructor
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "user_id")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler","cv"})
public class JobSeeker extends User{
	
	
	@JsonIgnore
	@OneToOne(mappedBy = "jobSeeker")
	private Cv cv;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "identity_number")
	private String identityNumber;
	
	@Column(name = "date_of_birth")
	private LocalDate dateOfBirth;

	public JobSeeker(String email, String password ,String firstName,  String lastName, String identityNumber, LocalDate dateOfBirth) {
		super(email, password);
		this.firstName = firstName;
		this.identityNumber = identityNumber;
		this.dateOfBirth = dateOfBirth;
	}
	
	
}
