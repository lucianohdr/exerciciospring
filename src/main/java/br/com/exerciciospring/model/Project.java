package br.com.exerciciospring.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="project")
public class Project {

	@Id
	@SequenceGenerator(sequenceName="project_id_gen", name = "project_id_gen")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="project_id_gen")
	private Long id;
	
	@Size(min=2, max=300)
	@Column(name="name", unique=true)
	private String name;
	
	@ManyToMany
	@JoinTable(name="emp_proj",
			joinColumns=@JoinColumn(name="idproject"),
			inverseJoinColumns=@JoinColumn(name="idemployee")
	)
	private List<Employee> employees;
	
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
	
	public void addEmployee(Employee employee){
		
	}
}
