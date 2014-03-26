package Jutjats;

public class Acusat {

	private String nom_Acusat;
	private String cognoms_Acusat;
/**
 * Constructor de la clase Acusat.
 * @param nom_Acusat Nom del acusat.
 * @param cognoms_Acusat Cognoms del acusat.
 */
	public Acusat(String nom_Acusat, String cognoms_Acusat) {
		super();
		this.nom_Acusat = nom_Acusat;
		this.cognoms_Acusat = cognoms_Acusat;
	}
/**
 * 
 * @return Torna el nom del acusat.
 */
	public String getNom_Acusat() {
		return nom_Acusat;
	}
/**
 * 
 * @param nom_Acusat Assigna o canvia el nom a un acusat.
 */
	public void setNom_Acusat(String nom_Acusat) {
		this.nom_Acusat = nom_Acusat;
	}
/**
 * 
 * @return Torna els cognoms del acusat.
 */
	public String getCognoms_Acusat() {
		return cognoms_Acusat;
	}
/**
 * 
 * @param cognoms_Acusat Assigna o canvia els cognoms d'un acusat.
 */
	public void setCognoms_Acusat(String cognoms_Acusat) {
		this.cognoms_Acusat = cognoms_Acusat;
	}

}
