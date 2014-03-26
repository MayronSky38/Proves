package Jutjats;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cas {
	private Acusat acusat;
	private Jutge jutge;
	private Sala sala;
	private int id_Cas;
	private String delicte;
	private Date data_Inici;
	private Date data_Fi;
	private boolean sentencia;
/**
 * Constructor de la classe Cas.
 * @param acusat Objecte del acusat.
 * @param jutge Objecte del Jutge
 * @param sala Objecte de la sala.
 * @param id_Cas Un numero per identificar cada cas.
 * @param delicte Una frase per sebre quin tipus de cas es.
 * @param data_Inici Quan comença el cas.
 * @param data_Fi Quan es preveu que ha terminat el cas o quan ha terminat.
 * @param sentencia Un boolea per declarar sentencia (True = Culpable, false = Innocent).
 */
	public Cas(Acusat acusat, Jutge jutge, Sala sala, int id_Cas,
			String delicte, Date data_Inici, Date data_Fi, boolean sentencia) {
		super();
		this.acusat = acusat;
		this.jutge = jutge;
		this.sala = sala;
		this.id_Cas = id_Cas;
		this.delicte = delicte;
		this.data_Inici = data_Inici;
		this.data_Fi = data_Fi;
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		sdf.format(data_Inici);
		sdf.format(data_Fi);
		this.sentencia = sentencia;
	}
/**
 * 
 * @return Torna l'objecte amb les dades del acusat.
 */
	public Acusat getAcusat() {
		return acusat;
	}
/**
 * 
 * @param acusat Assigna un acusat a un cas.
 */
	public void setAcusat(Acusat acusat) {
		this.acusat = acusat;
	}
/**
 * 
 * @return Torna l'objecte amb els dades del jutge.
 */
	public Jutge getJutge() {
		return jutge;
	}
/**
 * 
 * @param jutge Assigna un jutge a un cas.
 */
	public void setJutge(Jutge jutge) {
		this.jutge = jutge;
	}
/**
 * 
 * @return Torna l'objecte amb les dades de la sala.
 */
	public Sala getSala() {
		return sala;
	}
/**
 * 
 * @param sala Assigna una sala a un cas.
 */
	public void setSala(Sala sala) {
		this.sala = sala;
	}
/**
 * 
 * @return Torna l'identificador unic d'un cas.
 */
	public int getId_Cas() {
		return id_Cas;
	}
/**
 * 
 * @param id_Cas Assigna l'identificador a un cas.
 */
	public void setId_Cas(int id_Cas) {
		this.id_Cas = id_Cas;
	}
/**
 * 
 * @return Torna la frase del delicte del cas.
 */
	public String getDelicte() {
		return delicte;
	}
/**
 * 
 * @param delicte Assigna una frase amb el delicte al cas.
 */
	public void setDelicte(String delicte) {
		this.delicte = delicte;
	}
/**
 * 
 * @return Torna la data quan va començar el cas.
 */
	public Date getData_Inici() {
		return data_Inici;
	}
/**
 * 
 * @param data_Inici Assigna la data de quan va començar el cas.
 */
	public void setData_Inici(Date data_Inici) {
		this.data_Inici = data_Inici;
	}
/**
 * 
 * @return Torna la data quan es preveu que terminara el cas o quan ha terminat.
 */
	public Date getData_Fi() {
		return data_Fi;
	}
/**
 * 
 * @param data_Fi Assigna la data de quan es preveu que terminara el cas o quan ha terminat.
 */
	public void setData_Fi(Date data_Fi) {
		this.data_Fi = data_Fi;
	}
/**
 * 
 * @return Torna el valor de la sentencia, que per defecte es false de innocent.
 */
	public boolean isSentencia() {
		return sentencia;
	}
/**
 * 
 * @param sentencia Assigna un boolea a la sentencia del cas.
 */
	public void setSentencia(boolean sentencia) {
		this.sentencia = sentencia;
	}

}
