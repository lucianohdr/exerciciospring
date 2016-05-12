package br.com.exerciciospring.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="employee")
public class Employee {

	@Id
	@SequenceGenerator(sequenceName="employee_id_gen", name = "employee_id_gen")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="employee_id_gen")
	private Long id;
	
	@Column(name="name")
	@Size(min=2, max=300)
	private String name;
	
	@Column(name="salary")
	private BigDecimal salary;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj){
			return true;
		}
		
		if((obj == null) || (obj.getClass() != this.getClass())){
			return false;
		}
		
		Employee employee = (Employee) obj;
		if(this.getId().equals(employee.getId())){
			return true;
		}
		
		return false;
	}
}
