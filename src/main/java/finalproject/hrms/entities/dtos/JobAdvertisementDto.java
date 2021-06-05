package finalproject.hrms.entities.dtos;

import java.time.LocalDate;

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
	private LocalDate applyDate;
	private LocalDate lastApplyDate;

}
