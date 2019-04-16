package model;

public class Client {

	private String nom;
	private String prenom;
	private String adresse;
	private int codePostal;
	private String ville;
	private String tel;
	private int id;
	
	private Compte compte;
	
	
//ici je vais lier la classe compte à la classe client en mettant l'attribut "private Compte compte"
// il faut créer un nouveau constructeur qui prend en compte l'attribut compte	

	public Client(String nom, String prenom, model.Compte compte) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		compte = compte;
	}

	public Client(String nom, String prenom, String tel) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.tel = tel;
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

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", codePostal=" + codePostal
				+ ", ville=" + ville + ", tel=" + tel + ", id=" + id + ", Compte=" + compte + "]";
	}

	

}
