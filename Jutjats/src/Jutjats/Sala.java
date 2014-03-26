package Jutjats;

public class Sala {

	
	private String id_Sala;
	private boolean lliure;

	/**
	 * Aquest es el constructor de la clase sala.
	 * @param id_Sala Cada sala s'identifica amb un codi numeric i una lletra.
	 * @param lliure Cada sala te associat un boolea per sebre si esta lliure o no.
	 */
	public Sala(String id_Sala, boolean lliure) {
		super();
		this.id_Sala = id_Sala;
		this.lliure = lliure;
	}

	/**
	 * @return Torna l'ID de la sala. 
	 */
	public String getId_Sala() {
		return id_Sala;
	}

	/** 
	 * @param id_Sala Assigna l'ID a una sala.
	 */
	public void setId_Sala(String id_Sala) {
		this.id_Sala = id_Sala;
	}

/**
 * 
 * @return Torna un boolea per sebre si esta lliure una sala o no. (True = lliure, false = ocupada)
 */
	public boolean isLliure() {
		return lliure;
	}

/**
 * 
 * @param lliure Canvia el estat d'una sala.
 */
	public void setLliure(boolean lliure) {
		this.lliure = lliure;
	}	
}
