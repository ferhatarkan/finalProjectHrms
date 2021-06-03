package finalproject.hrms.entities.dtos;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobAdvertisementDto {

	private String companyName;
	private String name;
	private int openPositionCount;
	private Date applyDate;
	private Date lastApplyDate;

}
