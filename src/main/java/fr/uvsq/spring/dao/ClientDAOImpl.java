 package fr.uvsq.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;


import fr.uvsq.spring.model.Client;

@Repository
public class ClientDAOImpl implements ClientDAO {
	
	private static final Logger logger = LoggerFactory.getLogger(PersonDAOImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	@Override
	public Client findById(int id) {
		Session session = this.sessionFactory.getCurrentSession();		
		Client p = (Client) session.load(Client.class, new Integer(id));
		logger.info("Adress loaded successfully, Client details="+p);
		return p;
	}

	@Override
	public List<Client> findAll() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Client> clientsList = session.createQuery("from Client").list();
		for(Client p : clientsList){
			logger.info("Client List::"+p);
		}
		return clientsList;
	}

	@Override
	public void insert(Client nouveau) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(nouveau);
		logger.info("Client saved successfully, Client Details="+nouveau);
	}

	@Override
	public void update(Client nouveau) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(nouveau);
		logger.info("Client updated successfully, Client Details="+nouveau);
	}

	@Override
	public void delete(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Client p = (Client) session.load(Client.class, new Integer(id));
		if(null != p){
			session.delete(p);
		}
		logger.info("Client deleted successfully, Client details="+p);
	}
}
