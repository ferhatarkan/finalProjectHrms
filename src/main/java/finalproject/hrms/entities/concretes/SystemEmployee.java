package finalproject.hrms.entities.concretes;

import lombok.Data;

@Data
public class SystemEmployee {
	private int id;
	private int userId;
	private int departmentId;
	private String firstName;
	private String lastName;
	
	public SystemEmployee() {}

	public SystemEmployee(int id, int userId, int departmentId, String firstName, String lastName) {
		super();
		this.id = id;
		this.userId = userId;
		this.departmentId = departmentId;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
	
}
