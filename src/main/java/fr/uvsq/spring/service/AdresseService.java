package com.journaldev.spring.service;

import java.util.List;

import com.journaldev.spring.model.Adresse;

public interface AdresseService {
	
	Adresse findById(int id);
	List<Adresse> findAll();
	void insert(Adresse nouveau);
	void update(Adresse nouveau);
	void delete(int id);
}
