 package fr.uvsq.spring.model;

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
	private int id;
	private int quantite;
	private double montant;
	@OneToOne (cascade = CascadeType.ALL)
	private Produit produit;
	@ManyToOne 
	@JoinColumn (name="idPanier")
	private Panier panier;
	@ManyToOne 
	@JoinColumn (name="idCommande")
	private Commande commande;
	
	public LigneCommande(){
		super();
	}
	
	public LigneCommande(int quantite, double montant, Produit produit, Panier panier, Commande commande) {
		super();
		this.quantite = quantite;
		this.montant = montant;
		this.produit = produit;
		this.panier = panier;
		this.commande = commande;
	}
	public int getId() {
		return id;
	}
	public void setId(int idLigneCommande) {
		this.id = idLigneCommande;
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
