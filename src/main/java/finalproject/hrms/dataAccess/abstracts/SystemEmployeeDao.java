package finalproject.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import finalproject.hrms.entities.concretes.SystemEmployee;

public interface SystemEmployeeDao extends JpaRepository<SystemEmployee, Integer>{

}
