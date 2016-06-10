package fr.proxybanque.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CC")
public class CompteCourant extends Compte {

	@Id
	@Column(name="numeroCC")
	private String numeroCC;
	private double decouvert = 1000;
	
	/* ================================== */
	/* ========== ASSOCIATIONS ========== */
	/* ================================== */
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "client_id", referencedColumnName = "id_client")
	private Client client;
	

	public String getNumeroCC() {
		return numeroCC;
	}

	public void setNumeroCC(String numeroCC) {
		this.numeroCC = numeroCC;
	}

	public double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

	public CompteCourant() {
	}

	public CompteCourant(double solde, Date date, String numeroCC, double decouvert) {
		super();
		this.numeroCC = numeroCC;
		this.decouvert = decouvert;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	

}
