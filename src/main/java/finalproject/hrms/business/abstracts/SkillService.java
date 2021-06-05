package finalproject.hrms.business.abstracts;

import java.util.List;

import finalproject.hrms.core.utilities.results.DataResult;
import finalproject.hrms.core.utilities.results.Result;
import finalproject.hrms.entities.concretes.Skill;

public interface SkillService {

	Result deleteSkill(int skillId);

	DataResult<List<Skill>> getByCvId(int cvId);

}
