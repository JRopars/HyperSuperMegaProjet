package fr.proxybanque.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name="client")
@Table(name = "clients")
public class Client {

	@Id
	@Column(name = "id_client")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_client;
	private String nom;
	private String prenom;
	private String adresse;
	private String codeP;
	private String ville;
	private String telephone;

	
	/* ==================================== */
    /* ========== ASSOCIATONS ============= */
    /* ==================================== */
    @OneToOne(mappedBy = "client",fetch=FetchType.LAZY,cascade=CascadeType.REMOVE)
    private CompteCourant compteCourant;
    
    @OneToOne(mappedBy = "client",fetch=FetchType.LAZY,cascade=CascadeType.REMOVE)
    private CompteEpargne compteEpargne;
    
	@ManyToOne(fetch=FetchType.LAZY,cascade=CascadeType.REMOVE)
	@JoinColumn(name = "conseiller_id", referencedColumnName = "id_conseiller")
	private Conseiller conseiller;

	
	/**
	 * Constructeurs
	 */
	public Client() {
	}

	public Client(String nom, String prenom, String adresse, String codeP, String ville, String telephone) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.codeP = codeP;
		this.ville = ville;
		this.telephone = telephone;
	}

	public Client(int id_client, String nom, String prenom, String adresse, String codeP, String ville,
			String telephone) {
		super();
		this.id_client = id_client;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.codeP = codeP;
		this.ville = ville;
		this.telephone = telephone;
	}

	/**
	 * GETTERS / SETTERS
	 */

	public int getId_client() {
		return id_client;
	}

	public void setId_client(int id_client) {
		this.id_client = id_client;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getCodeP() {
		return codeP;
	}

	public void setCodeP(String codeP) {
		this.codeP = codeP;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Conseiller getConseiller() {
		return conseiller;
	}

	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}

	public CompteCourant getCompteCourant() {
		return compteCourant;
	}

	public void setCompteCourant(CompteCourant compteCourant) {
		this.compteCourant = compteCourant;
	}

	public CompteEpargne getCompteEpargne() {
		return compteEpargne;
	}

	public void setCompteEpargne(CompteEpargne compteEpargne) {
		this.compteEpargne = compteEpargne;
	}
	
	

}
