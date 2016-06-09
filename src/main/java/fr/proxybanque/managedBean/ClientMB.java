package fr.proxybanque.managedBean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import fr.proxybanque.model.Client;
import fr.proxybanque.service.IClientService;

@ManagedBean(name="clientMB")
@SessionScoped
@Component
public class ClientMB {
		


	private List<Client> clients = new ArrayList<Client>();
	private Client client;
		
	@Autowired
	private IClientService serviceCl;
		
	public ClientMB() {
		client = new Client();
	}
		
		
	public void creerClient(){
	     serviceCl.creerClient(client);
	}
	
	
	public List<Client> getClients() {
		return clients;
	}
	
	public void setClients(List<Client> clients) {
		this.clients = clients;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
}


