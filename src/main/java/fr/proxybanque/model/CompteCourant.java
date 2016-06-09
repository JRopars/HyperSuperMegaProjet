package fr.proxybanque.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CC")
public class CompteCourant extends Compte {

	@Id
	private String numero;
	private double decouvert = 1000;

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

	public CompteCourant() {
	}

	public CompteCourant(double solde, Date date, String numero, double decouvert) {
		super();
		this.numero = numero;
		this.decouvert = decouvert;
	}

}
