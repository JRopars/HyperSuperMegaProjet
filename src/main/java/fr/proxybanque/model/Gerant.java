package fr.proxybanque.model;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name="gerant")
@Table(name="gerants")
public class Gerant{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_gerant")
	private int id;
	private String login;
	private String password;
	
	@OneToMany(mappedBy = "gerant",fetch=FetchType.LAZY)
	private Collection<Conseiller> conseiller;
	
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
	public Gerant(int id, String login, String password) {
		super();
		this.id = id;
		this.login = login;
		this.password = password;
	}
	public Gerant(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}
	public Gerant() {
		super();
	}
	public Collection<Conseiller> getConseiller() {
		return conseiller;
	}
	public void setConseiller(Collection<Conseiller> conseiller) {
		this.conseiller = conseiller;
	}
	

}
