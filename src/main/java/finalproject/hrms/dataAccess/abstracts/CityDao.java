package finalproject.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import finalproject.hrms.entities.concretes.City;

public interface CityDao extends JpaRepository<City, Integer>{

}
