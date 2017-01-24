package com.journaldev.spring.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class LigneCommande {
	@Id
	@GeneratedValue
	Long idLigneCommande;
	int quantite;
	double montant;
	@OneToOne (cascade = CascadeType.ALL)
	Produit produit;
	@ManyToOne 
	@JoinColumn (name="idPanier")
	Panier panier;
	@ManyToOne 
	@JoinColumn (name="idCommande")
	Commande commande;
	
	protected LigneCommande(int quantite, double montant, Produit produit, Panier panier, Commande commande) {
		super();
		this.quantite = quantite;
		this.montant = montant;
		this.produit = produit;
		this.panier = panier;
		this.commande = commande;
	}
	public Long getIdLigneCommande() {
		return idLigneCommande;
	}
	public void setIdLigneCommande(Long idLigneCommande) {
		this.idLigneCommande = idLigneCommande;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public Produit getProduit() {
		return produit;
	}
	public void setProduit(Produit produit) {
		this.produit = produit;
	}
	public Panier getPanier() {
		return panier;
	}
	public void setPanier(Panier panier) {
		this.panier = panier;
	}
	public Commande getCommande() {
		return commande;
	}
	public void setCommande(Commande commande) {
		this.commande = commande;
	}
	
	
}
