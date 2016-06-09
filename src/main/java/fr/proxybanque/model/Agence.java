package fr.proxybanque.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="agences")
public class Agence {
	
	@Id
	@Column(name="agence_id")
	private String id;
	private Date date;
	
	
	public Agence(String id, Date date) {
		super();
		this.id = id;
		this.date = date;
	}

	public Agence() {
		super();
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}
