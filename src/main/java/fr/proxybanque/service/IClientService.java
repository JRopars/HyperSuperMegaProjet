package fr.proxybanque.service;

import fr.proxybanque.model.Client;

public interface IClientService {

	
	
	
	
	
	public void creerClient(Client client);
	
	public void supprimerClient(int idClient);
	
	public void modifierClient(Client client);
	
	public Client lireClient(int idClient);
	
	//public void virement(double somme);
	
	//public void simulerCreditConso();
	
	//public void simulerCreditImmo();
	
	//public void placement(double somme);
	
}
