package finalproject.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="users")
public class User {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="email")
	private String email;
	
	@Column(name="user_name")
	private String userName;
	
	@Column(name="password")
	private String password;
	
	public User() {}
	public User(int id, String email, String userName, String password) {
		super();
		this.id = id;
		this.email = email;
		this.userName = userName;
		this.password = password;
	}
}