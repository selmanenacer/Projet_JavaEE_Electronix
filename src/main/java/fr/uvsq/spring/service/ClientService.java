 package fr.uvsq.spring.service;

import java.util.List;

import fr.uvsq.spring.model.Client;



public interface ClientService {
	
	Client findById(int id);
	List<Client> findAll();
	void insert(Client nouveau);
	void update(Client nouveau);
	void delete(int id);

}
