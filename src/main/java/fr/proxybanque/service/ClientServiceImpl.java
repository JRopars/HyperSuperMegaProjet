package fr.proxybanque.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.proxybanque.dao.ClientDAO;
import fr.proxybanque.dao.IClientDAO;
import fr.proxybanque.model.Client;

@Service("clientService")
public class ClientServiceImpl implements IClientService {

	@Autowired
	private IClientDAO clientDao;
	
	/**
	 * setter
	 * @param clientDao
	 */
	public void setClientDao(ClientDAO clientDao) {
		this.clientDao = clientDao;
	}

	/**
	 * ajouter un client
	 */
	public void creerClient(Client client) {
		clientDao.addClient(client);		
	}

	/**
	 * supprimer un client � partir de son id
	 */
	public void supprimerClient(int idClient) {
		clientDao.deleteClient(idClient);	
	}

	/**
	 * modifier un client
	 */
	public void modifierClient(Client client) {
		clientDao.updateClient(client);		
	}

	/**
	 * recup�rer un client � partir de son id
	 */
	public Client lireClient(int idClient) {	
		return clientDao.getClientById(idClient);
	}

}
