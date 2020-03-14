package br.edu.ifpb.mpti.linkedjobs.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Company{
    @Id
    private String cnpj;

    private List<Job> jobs;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public List<Job> getJobs() {
		return jobs;
	}

	public void setJobs(List<Job> jobs) {
		this.jobs = jobs;
	}

}