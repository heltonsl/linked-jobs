package br.edu.ifpb.mpti.linkedjobs.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {

    @Id
    private String cpf;

    private String name;

    private Integer idade;

    private String sexo;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

    

    

}