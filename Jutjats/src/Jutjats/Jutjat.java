package Jutjats;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

public class Jutjat {

	ArrayList<Jutge> llistaJutges;
	ArrayList<Acusat> llistaAcusats;
	ArrayList<Sala> llistaSales;
	ArrayList<Cas> llistaCasos;
/**
 * 
 * @return Torna la llista dels jutges.
 */
	public ArrayList<Jutge> getLlistaJutges() {
		return llistaJutges;
	}
/**
 * 
 * @param llistaJutges Assigna una llista a jutges.
 */
	public void setLlistaJutges(ArrayList<Jutge> llistaJutges) {
		this.llistaJutges = llistaJutges;
	}
/**
 * 
 * @return Torna la llista dels acusats.
 */
	public ArrayList<Acusat> getLlistaAcusats() {
		return llistaAcusats;
	}

	public void setLlistaAcusats(ArrayList<Acusat> llistaAcusats) {
		this.llistaAcusats = llistaAcusats;
	}
/**
 * 
 * @return Torna la llista de les sales.
 */
	public ArrayList<Sala> getLlistaSales() {
		return llistaSales;
	}

	public void setLlistaSales(ArrayList<Sala> llistaSales) {
		this.llistaSales = llistaSales;
	}
/**
 * 
 * @return Torna la llista dels casos.
 */
	public ArrayList<Cas> getLlistaCasos() {
		return llistaCasos;
	}

	public void setLlistaCasos(ArrayList<Cas> llistaCasos) {
		this.llistaCasos = llistaCasos;
	}
/**
 * A aquest metode tenim un parell de dades de prova.
 */
	public Jutjat() {
		llistaJutges = new ArrayList<>();
		llistaAcusats = new ArrayList<>();
		llistaSales = new ArrayList<>();
		llistaCasos = new ArrayList<>();

		Jutge Mauricio = new Jutge("Mauricio", "Colmenero");
		llistaJutges.add(Mauricio);

		Acusat Mario = new Acusat("Mario", "Bros");
		llistaAcusats.add(Mario);

		Sala Primera = new Sala("1A", true);
		Sala Segona = new Sala("2A", false);
		llistaSales.add(Primera);
		llistaSales.add(Segona);
	}
/**
 * Aquest metode serveix per afegir un nou jutge al llistat de jutges.
 * @param nou Objecte del nou jutge amb el qual comprovarem si existeix o no abans de ficar-lo a la llista.
 * @return Torna un boolea true quan tot ha sortit be, false si ha sortit malament.
 */
	public boolean afegir_Jutge(Jutge nou) {
		for (int i = 0; i < llistaJutges.size(); i++) {
			if (llistaJutges.get(i).equals(nou)) {
				/* System.out.println("El jutge ja es troba a la llista"); */
				return false;
			}
		}
		/* System.out.println("El jutge ha sigut afegit a la llista"); */
		llistaJutges.add(nou);
		return true;
	}
/**
 * Aquest metode serveix per eliminar un jutge del llistat de jutges.
 * @param vell Objecte del jutge que volem eliminar.
 * @return Tornara un true si l'ha pogut eliminar i un false si no ha pogut.
 */
	public boolean eliminar_Jutge(Jutge vell) {
		for (int i = 0; i < llistaJutges.size(); i++) {
			if (llistaJutges.get(i).equals(vell)) {
				/*
				 * System.out.println("El jutge ha sigut esborrat de la llista");
				 */
				llistaJutges.remove(vell);
				return true;
			}
		}
		/* System.out.println("El jutge no s'ha trobat a la llista"); */
		return false;
	}

	
	/**
	 * Donat un objecte de tipus Acusat, cerca a la llista de casos i torna tots els casos en que apareix l'acusat.
	 * @param acusat Objecte amb les dades del acusat.
	 * @return Torna totes les coincidencies de casos a un arraylist de casos.
	 */
	public ArrayList<Cas> casos_Acusat(Acusat acusat) {
		ArrayList<Cas> Coincidencies;
		Coincidencies = new ArrayList<>();

		for (int i = 0; i < llistaCasos.size(); i++) {
			if (llistaCasos.get(i).getAcusat().equals(acusat))
				;
			Coincidencies.add(llistaCasos.get(i));
		}

		return Coincidencies;
	}

	
	  
	/**
	 * Donat un objecte de tipus Jutge, cerca a la llista de casos i torna tots
	 * els casos en que apareix el jutge.
	 * @param jutge Objecte amb les dades del jutge.
	 * @return Torna un array list de casos on apareix aquest jutge.
	 */ 
	public ArrayList<Cas> casos_Jutge(Jutge jutge) {
		ArrayList<Cas> Coincidencies;
		Coincidencies = new ArrayList<>();

		for (int i = 0; i < llistaCasos.size(); i++) {
			if (llistaCasos.get(i).getJutge().equals(jutge))
				;
			Coincidencies.add(llistaCasos.get(i));
		}

		return Coincidencies;
	}

	
	/**
	 * Aquest metode demana l'identificacio unica de la sala i torna un boolea
	 * amb el seu estat. (true = lliure, false = ocupada)
	 * @param sala Pasam l'identificacio d'una sala.
	 * @return Torna el boolea que conte l'objecte sala, true per lliure, false per ocupada. De no trobarla, enviaria un false.
	 */
	public boolean estat_Sala(String sala) {
		for (int i = 0; i < llistaSales.size(); i++) {
			if (llistaSales.get(i).getId_Sala().equals(sala)) {
				return llistaSales.get(i).isLliure();
			}

		}
		/* System.out.println("La sala no existeix"); */
		return false;
	}

	
	  
	 
	/**
	 *	Per crear un cas nou, s'ha de passar a aquest metode un objecte acusat,
	 * 	un altre jutge, un de sala i un string amb el delicte. Despres, tambe
	 * 	necessitam l'informacio de quan començara el cas i quan preveim que
	 * 	acabara, per motius d'organitzacio. Aquest cas s'afegeix al a llista de
	 * 	casos i el metode torna un objecte de tipus cas.
	 * @param acusat Objecte amb les dades del acusat.
	 * @param jutge Objecte amb les dades del jutge.
	 * @param sala Objecte amb les dades de la sala.
	 * @param delicte Una frase de resum del cas.
	 * @param inici Data de quan comença el cas.
	 * @param prediccio Data de quan preveim que terminara el cas.
	 * @return Torna un objecte cas ja montat amb totes les dades ficades i l'afegeix a la llista de casos.
	 */
	public Cas nou_cas(Acusat acusat, Jutge jutge, Sala sala, String delicte,
			Date inici, Date prediccio) throws ParseException {
		/*
		 * Encara que ara mateix no hi ha cap registre a cas, aixi que afegirem
		 * un manualment.
		 */
		int id;
		if (llistaCasos.isEmpty()) {
			id = 100;
		} else {
			id = llistaCasos.get(llistaCasos.size() - 1).getId_Cas();
			id++;
		}

		/*
		 * Amb el metode que feim servir actualment, hem de posar la sala com
		 * ocupada.
		 */
		sala.setLliure(false);
		for (int i = 0; i < llistaSales.size(); i++) {
			if (llistaSales.get(i).getId_Sala().equals(sala)) {
				llistaSales.get(i).setLliure(false);
			}
		}
		/*
		 * Composicio del objecte Cas: (Obj del acusat, Obj del jutge, Obj de la
		 * sala, Id del cas, Delicte del cas, Data d'inici del judici, data de
		 * final i estat actual de la sentencia (sentencia true (culpable))
		 */

		Cas denuncia_1 = new Cas(acusat, jutge, sala, id, delicte, inici,
				prediccio, false);
		llistaCasos.add(denuncia_1);
		return denuncia_1;
	}


	  
	 
	/**
	 * Per dictar sentencia, s'ha de passar un objecte de tipus cas i la
	 * resolucio del cas com a boolea (true= culpable, false=innocent).
	 * @param cas_per_sentencia Objecte cas a qui l'hem d'aplicar una sentencia.
	 * @param resolucio El boolea que conte la sentencia: true = Culpable, false = Innocent 
	 */
	public void sentencia(Cas cas_per_sentencia, boolean resolucio) {
		cas_per_sentencia.setSentencia(resolucio);
		/*
		 * Una vegada hem aplicat la sentencia, hem de deixar lliure la sala que
		 * tenia. (true = lliure, false = ocupada)
		 */
		Sala sala = cas_per_sentencia.getSala();
		for (int i = 0; i < llistaSales.size(); i++) {
			if (llistaSales.get(i).getId_Sala().equals(sala)) {
				llistaSales.get(i).setLliure(true);
			}
		}
		/*
		 * Lo darrer que hem de fer es guardar la data final del cas, que sira
		 * la mateixa en que es dicta sentencia.
		 */
		Date avui = new Date();
		cas_per_sentencia.setData_Fi(avui);
	}
}
