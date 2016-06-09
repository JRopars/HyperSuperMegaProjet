package fr.proxybanque.dao;

import java.util.List;

import fr.proxybanque.model.Client;

public interface IClientDAO {
	
	
	
	
	
	
	public void addClient(Client pClient);
	
	public List<Client> getAllClient();
	
	public Client getClientById(int pId);
	
	public void deleteClient(int pId);
	
	public void updateClient(Client pClient);

}
