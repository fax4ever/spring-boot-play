package it.redhat.demo.entity;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String name;
	private String code;
	private Integer area;

	protected Employee() {}

	public Employee(String name, String code, Integer area) {
		this.name = name;
		this.code = code;
		this.area = area;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getArea() {
		return area;
	}

	public void setArea(Integer area) {
		this.area = area;
	}

	@Override
	public boolean equals(Object o) {
		if ( this == o ) {
			return true;
		}
		if ( o == null || getClass() != o.getClass() ) {
			return false;
		}
		Employee employee = (Employee) o;
		return Objects.equals( id, employee.id ) &&
				Objects.equals( name, employee.name ) &&
				Objects.equals( code, employee.code ) &&
				Objects.equals( area, employee.area );
	}

	@Override
	public int hashCode() {
		return Objects.hash( id, name, code, area );
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder( "Employee{" );
		sb.append( "id=" ).append( id );
		sb.append( ", name='" ).append( name ).append( '\'' );
		sb.append( ", code='" ).append( code ).append( '\'' );
		sb.append( ", area=" ).append( area );
		sb.append( '}' );
		return sb.toString();
	}
}
