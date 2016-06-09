package fr.proxybanque.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CE")
public class CompteEpargne extends Compte{
	
	@Id
	private String numero;
	private double tauxEpargne = 0.03;
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public double getTauxEpargne() {
		return tauxEpargne;
	}
	public void setTauxEpargne(double tauxEpargne) {
		this.tauxEpargne = tauxEpargne;
	}
	
	public CompteEpargne(double solde, Date date,String numero, double tauxEpargne) {
		super();
		this.numero = numero;
		this.tauxEpargne = tauxEpargne;
	}
	public CompteEpargne() {
	}
	
}
