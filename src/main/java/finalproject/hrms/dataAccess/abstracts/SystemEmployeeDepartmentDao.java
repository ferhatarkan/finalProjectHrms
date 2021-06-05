package finalproject.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import finalproject.hrms.entities.concretes.SystemEmployeeDepartment;

public interface SystemEmployeeDepartmentDao extends JpaRepository<SystemEmployeeDepartment, Integer> {

}
