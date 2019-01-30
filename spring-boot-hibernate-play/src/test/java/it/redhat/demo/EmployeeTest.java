package it.redhat.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;

import it.redhat.demo.entity.Employee;
import it.redhat.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeTest {

	@Autowired
	private EmployeeRepository repository;

	@Test
	public void saveAndLoad() {
		Employee employee = new Employee( "Fabio Massimo", "fax4ever", 739 );
		repository.save( employee );
		Employee reloaded = repository.load( employee.getId() );

		assertThat( reloaded ).isEqualTo( employee );
	}

}
