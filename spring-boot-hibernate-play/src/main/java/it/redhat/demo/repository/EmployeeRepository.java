package it.redhat.demo.repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import it.redhat.demo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class EmployeeRepository {

	@Autowired
	private EntityManager entityManager;

	public void save(Employee employee) {
		entityManager.persist( employee );
	}

	public Employee load(Integer id) {
		return entityManager.find( Employee.class, id );
	}

}
