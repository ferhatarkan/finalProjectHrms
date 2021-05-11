package finalproject.hrms.entities.concretes;

import lombok.Data;

@Data
public class Employer {
	private int id;
	private int userId;
	private int jobPositionId;
	private String companyName;
	private String phoneNumber;
	private String webSite;
	


	public Employer(int id, int userId, int jobPositionId, String companyName, String phoneNumber, String webSite) {
		super();
		this.id = id;
		this.userId = userId;
		this.jobPositionId = jobPositionId;
		this.companyName = companyName;
		this.phoneNumber = phoneNumber;
		this.webSite = webSite;
	}
}
