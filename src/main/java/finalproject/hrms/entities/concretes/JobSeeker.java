package finalproject.hrms.entities.concretes;

import java.sql.Date;

import lombok.Data;

@Data
public class JobSeeker {
	private int id;
	private int userId;
	private String firstName;
	private String lastName;
	private String ıdentityNumber;
	private Date dateOfBirth;
	
	public JobSeeker() {}

	public JobSeeker(int id, int userId, String firstName, String lastName, String identityNumber, Date dateOfBirth) {
		super();
		this.id = id;
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		ıdentityNumber = identityNumber;
		this.dateOfBirth = dateOfBirth;
	}
	
}
