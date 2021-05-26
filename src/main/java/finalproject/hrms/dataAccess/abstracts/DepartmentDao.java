package finalproject.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import finalproject.hrms.entities.concretes.Department;

public interface DepartmentDao extends JpaRepository<Department, Integer> {

}
