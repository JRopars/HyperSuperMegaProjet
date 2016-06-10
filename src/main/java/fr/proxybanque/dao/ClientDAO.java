package fr.proxybanque.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hibernate.Query;
import org.hibernate.Session;
import fr.proxybanque.model.Client;

@Repository("clientDAO")
public class ClientDAO implements IClientDAO {

	@Autowired
	protected SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public void addClient(Client pClient) {
		System.out.println("***********je suis ici**********");
		Session session = sessionFactory.openSession();
		System.out.println("***********je suis ici**********");
		session.save(pClient);
		
	}

	public List<Client> getAllClient() {
		return null;
//Session session = sessionFactory.openSession();
//		
//		String HQLgetAll = "FROM clients";
//		
//		Query query = session.createQuery(HQLgetAll);
//
//		List<Client> clientList = query.list();
//		return clientList;
	}

	public Client getClientById(int pId) {
		
		return null;
	}

	public void deleteClient(int pId) {

		
	}

	public void updateClient(Client pClient) {
	
		
	}

}
