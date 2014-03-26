package Jutjats;

public class Jutge {

	private String nom_Jutge;
	private String cognoms_Jutge;

	/**
	 * Aquest es el constructor de la clase Jutge.
	 * @param nom_Jutge El nom d'un jutge.
	 * @param cognoms_Jutge Els cognoms d'un jutge.
	 */
	public Jutge(String nom_Jutge, String cognoms_Jutge) {
		super();
		this.nom_Jutge = nom_Jutge;
		this.cognoms_Jutge = cognoms_Jutge;
	}
/**
 * 
 * @return Torna el nom d'un jutge.
 */
	public String getNom_Jutge() {
		return nom_Jutge;
	}
/**
 * 
 * @param nom_Jutge Assigna un nou nom a un jutge.
 */
	public void setNom_Jutge(String nom_Jutge) {
		this.nom_Jutge = nom_Jutge;
	}
/**
 * 
 * @return Torna els cognoms d'un jutge.
 */
	public String getCognoms_Jutge() {
		return cognoms_Jutge;
	}
/**
 * 
 * @param cognoms_Jutge Assigna uns nous cognoms a un jutge.
 */
	public void setCognoms_Jutge(String cognoms_Jutge) {
		this.cognoms_Jutge = cognoms_Jutge;
	}

}
