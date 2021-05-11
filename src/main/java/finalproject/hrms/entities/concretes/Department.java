package finalproject.hrms.entities.concretes;

import lombok.Data;

@Data
public class Department {
	private int id;
	private String name;
	
	public Department() {}

	public Department(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}
