package fr.proxybanque.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CE")
public class CompteEpargne extends Compte {

	@Id
	private String numeroCE;
	private double tauxEpargne = 0.03;

	/* ================================== */
	/* ========== ASSOCIATIONS ========== */
	/* ================================== */
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "client_id", referencedColumnName = "id_client")
	private Client client;
	

	public String getNumeroCE() {
		return numeroCE;
	}

	public void setNumeroCE(String numeroCE) {
		this.numeroCE = numeroCE;
	}

	public double getTauxEpargne() {
		return tauxEpargne;
	}

	public void setTauxEpargne(double tauxEpargne) {
		this.tauxEpargne = tauxEpargne;
	}

	public CompteEpargne(double solde, Date date, String numeroCE, double tauxEpargne) {
		super();
		this.numeroCE = numeroCE;
		this.tauxEpargne = tauxEpargne;
	}

	public CompteEpargne() {
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	
}
