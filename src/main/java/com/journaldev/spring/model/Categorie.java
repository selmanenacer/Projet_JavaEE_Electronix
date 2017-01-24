package com.journaldev.spring.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Categorie {
	@Id
	@GeneratedValue
	private int id;
	private String non;
	private String description;
	
	@OneToMany(mappedBy="categorie")
	private Set<Produit> listProduit = new HashSet<Produit>();
	
	public Categorie() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Categorie( String non, String description, Set<Produit> listProduit) {
		super();
		this.non = non;
		this.description = description;
		this.listProduit = listProduit;
	}
	public int getId() {
		return id;
	}
	
	public void setId(int idCategorie) {
		this.id = idCategorie;
	}
	public String getNon() {
		return non;
	}
	public void setNon(String non) {
		this.non = non;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Set<Produit> getListProduit() {
		return listProduit;
	}
	public void setListProduit(Set<Produit> listProduit) {
		this.listProduit = listProduit;
	}
	
	
}
