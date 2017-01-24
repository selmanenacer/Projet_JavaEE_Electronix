package com.journaldev.spring.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Facture {
	@Id
	@GeneratedValue
	Long id_facture;
	
	@OneToOne(mappedBy="facture", cascade=CascadeType.ALL)
	Commande commande;
	
	protected Facture(Commande commande) {
		super();
		this.commande = commande;
	}
	public Long getId_facture() {
		return id_facture;
	}
	public void setId_facture(Long id_facture) {
		this.id_facture = id_facture;
	}
	public Commande getCommande() {
		return commande;
	}
	public void setCommande(Commande commande) {
		this.commande = commande;
	}
	
	
	
}
