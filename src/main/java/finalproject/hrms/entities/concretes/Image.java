package finalproject.hrms.entities.concretes;

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
@Table(name = "images")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler","cv"})
public class Image {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	//@Column(name = "cv_id")
	//private int cvId;
	
	@Column(name = "image_name")
	private int imageName;
	
	@Column(name = "image_url")
	private int imageUrl;
	
	@Column(name = "image_id")
	private int imageId;
	
	@ManyToOne()
	@JoinColumn(name = "cv_id")
	private Cv cv;
}
