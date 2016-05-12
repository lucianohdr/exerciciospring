package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	
	@Column(name="name")
	@Size(min=2, max=300)
	private String name;
	
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
}
