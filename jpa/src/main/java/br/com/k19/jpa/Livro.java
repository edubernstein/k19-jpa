package br.com.k19.jpa;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Livro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long				id;
	
	private String				nome;
	
	@ManyToMany
	@JoinTable(name = "Liv_Aut", joinColumns = @JoinColumn(name = "Liv_ID"), inverseJoinColumns = @JoinColumn(name = "Aut_ID"))
	private Collection<Autor>	autores	= new ArrayList<Autor>();
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Collection<Autor> getAutores() {
		return autores;
	}
	
	public void setAutores(Collection<Autor> autores) {
		this.autores = autores;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}
