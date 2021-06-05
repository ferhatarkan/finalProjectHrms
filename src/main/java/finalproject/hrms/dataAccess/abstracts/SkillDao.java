package finalproject.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import finalproject.hrms.entities.concretes.Skill;

public interface SkillDao extends JpaRepository<Skill, Integer>{
	 List<Skill> findByCvId(int id);
}
