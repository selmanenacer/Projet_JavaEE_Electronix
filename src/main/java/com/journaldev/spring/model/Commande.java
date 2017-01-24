package com.journaldev.spring.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class Commande {
	@Id
	@GeneratedValue
	Long idCommande;
	Date dateCommande;
	double montant;
	
	@OneToMany(mappedBy="commande")
	Set<LigneCommande> ligneCommandes = new HashSet<LigneCommande>();
	
	@ManyToOne 
	@JoinColumn (name="idClient")
	Client client;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	Facture facture;
	
	protected Commande(Date dateCommande, double montant, Set<LigneCommande> ligneCommandes,
			Client client, Facture facture) {
		super();
		this.dateCommande = dateCommande;
		this.montant = montant;
		this.ligneCommandes = ligneCommandes;
		this.client = client;
		this.facture = facture;
	}
	public Long getIdCommande() {
		return idCommande;
	}
	public void setIdCommande(Long idCommande) {
		this.idCommande = idCommande;
	}
	public Date getDateCommande() {
		return dateCommande;
	}
	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public Set<LigneCommande> getLigneCommandes() {
		return ligneCommandes;
	}
	public void setLigneCommandes(Set<LigneCommande> ligneCommandes) {
		this.ligneCommandes = ligneCommandes;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Facture getFacture() {
		return facture;
	}
	public void setFacture(Facture facture) {
		this.facture = facture;
	}
	
	
	

}
