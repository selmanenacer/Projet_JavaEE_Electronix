package com.journaldev.spring.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class Panier {
	@Id
	@GeneratedValue
	Long idPanier;
	@OneToOne
	@PrimaryKeyJoinColumn
	Client client;
	@OneToMany(mappedBy="panier")
	Set<LigneCommande> ligneCommandes = new HashSet<LigneCommande>();
	
	protected Panier(Client client, Set<LigneCommande> ligneCommandes) {
		super();
		this.client = client;
		this.ligneCommandes = ligneCommandes;
	}
	public Long getIdPanier() {
		return idPanier;
	}
	public void setIdPanier(Long idPanier) {
		this.idPanier = idPanier;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Set<LigneCommande> getLigneCommandes() {
		return ligneCommandes;
	}
	public void setLigneCommandes(Set<LigneCommande> ligneCommandes) {
		this.ligneCommandes = ligneCommandes;
	}
	
	

}
