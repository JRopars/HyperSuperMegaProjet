package fr.proxybanque.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="conseillers")
public class Conseiller {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="conseiller_id")
	private int id;
	private String login;
	private String password;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public Conseiller() {
	}
	
	public Conseiller(int id, String login, String password) {
		super();
		this.id = id;
		this.login = login;
		this.password = password;
	}
	public Conseiller(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}
	
	
	
	
	

}
