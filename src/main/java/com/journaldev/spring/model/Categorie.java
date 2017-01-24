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
	Long idCategorie;
	String non;
	String description;
	
	@OneToMany(mappedBy="categorie")
	Set<Produit> listProduit = new HashSet<Produit>();
	protected Categorie( String non, String description, Set<Produit> listProduit) {
		super();
		this.non = non;
		this.description = description;
		this.listProduit = listProduit;
	}
	public Long getIdCategorie() {
		return idCategorie;
	}
	public void setIdCategorie(Long idCategorie) {
		this.idCategorie = idCategorie;
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
