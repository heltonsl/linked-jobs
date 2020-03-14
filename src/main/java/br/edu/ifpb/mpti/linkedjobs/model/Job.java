package br.edu.ifpb.mpti.linkedjobs.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Job {
    @Id
    private Integer id;

    private Company company;

    private Integer salary;

    private String occupation;

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
    
}