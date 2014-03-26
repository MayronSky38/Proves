package Jutjats.junit;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

import Jutjats.Acusat;
import Jutjats.Cas;
import Jutjats.Jutge;
import Jutjats.Jutjat;
import Jutjats.Sala;

public class ProvesJutjat {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/* Comprovam que els valors que ens passen no son nuls. */
	@Test
	public void testAfegir_Jutge() {
		Jutge prova = new Jutge(null, null);
		assertNull("El nom del jutge no pot ser null", prova.getNom_Jutge());
		assertNull("Els cognoms del jutge no poden ser null",
				prova.getCognoms_Jutge());
	}

	/*
	 * Feim una execucio de proves: Afegim un jutge i l'eliminam per provar que
	 * aquests dos metodes funcionen be.
	 */

	@Test
	public void testAfegir_Eliminar_Jutge() {
		Jutge prova = new Jutge("Abraham", "Lincoln");
		Jutjat proves = new Jutjat();
		proves.afegir_Jutge(prova);
		proves.eliminar_Jutge(prova);
	}

	/* Comprovam que els valors que ens passen no son nuls. */
	@Test
	public void testCasos_Acusat() {
		Acusat prova = new Acusat(null, null);
		assertNull("El nom del acusat no pot ser null", prova.getNom_Acusat());
		assertNull("Els cognoms del acusat no poden ser null",
				prova.getCognoms_Acusat());
	}

	/*
	 * Feim una execucio de proves: Provam el metode de cerca.
	 */
	@Test
	public void testCasos_Acusat_Cerca_Prova() {
		Acusat prova = new Acusat("Mario", "Bros");
		Jutjat proves = new Jutjat();
		proves.casos_Acusat(prova);
	}

	/* Comprovam que els valors que ens passen no son nuls. */
	@Test
	public void testCasos_Jutge() {
		Jutge prova = new Jutge(null, null);
		assertNull("El nom del jutge no pot ser null", prova.getNom_Jutge());
		assertNull("Els cognoms del jutge no poden ser null",
				prova.getCognoms_Jutge());
	}

	/*
	 * Feim una execucio de proves: Provam el metode de cerca.
	 */
	@Test
	public void testCasos_Jutge_Cerca_Prova() {
		Jutge prova = new Jutge("Mauricio", "Colmenero");
		Jutjat proves = new Jutjat();
		proves.casos_Jutge(prova);
	}

	/* Comprovam que els valors que ens passen no son nuls. */
	@Test
	public void testEstat_Sala() {
		String sala = null;
		assertNull("L'ID de la sala no pot ser null", sala);
	}

	/*
	 * Feim una execucio de proves: Provam el metode de cerca.
	 */
	@Test
	public void testEstat_Sala_Cerca_Prova() {
		String sala = "1A";
		Jutjat proves = new Jutjat();
		proves.estat_Sala(sala);
	}

	/* Comprovam que els valors que ens passen no son nuls. */
	@Test
	public void testNou_cas() {
		Jutge prova1 = new Jutge(null, null);
		assertNull("El nom del jutge no pot ser null", prova1.getNom_Jutge());
		assertNull("Els cognoms del jutge no poden ser null",
				prova1.getCognoms_Jutge());
		Acusat prova2 = new Acusat(null, null);
		assertNull("El nom del acusat no pot ser null", prova2.getNom_Acusat());
		assertNull("Els cognoms del acusat no poden ser null",
				prova2.getCognoms_Acusat());
		Sala prova3 = new Sala(null, false);
		assertNull("L'ID de la sala no pot ser null", prova3.getId_Sala());
		assertFalse("La sala ha d'estar lliure", prova3.isLliure());
	}

	/*
	 * Feim una execucio de proves: Comprovam que el cas s'ha afegit
	 * correctament a la llista de casos.
	 */
	@Test
	public void testNou_cas_execucio() throws ParseException {
		Jutjat prova = new Jutjat();

		Jutge Mauricio = new Jutge("Mauricio", "Colmenero");
		Acusat Mario = new Acusat("Mario", "Bros");
		Sala Segona = new Sala("2A", true);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
		Cas denuncia_1 = prova.nou_cas(Mario, Mauricio, Segona,
				"Comerç de drogues.", sdf.parse("05/03/2014"), sdf.parse("10/03/2014"));

		ArrayList<Cas> proves;
		proves = prova.getLlistaCasos();
		boolean comprovar = false;
		for (int i = 0; i < proves.size(); i++) {

			if (proves.get(i).equals(denuncia_1)) {
				comprovar = true;
				break;
			}
		}
		if (!comprovar) {
			fail("El cas no existeix");
		}
	}

	/* Comprovam que els valors que ens passen no son nuls. */
	@Test
	public void testSentencia() {
		Jutge prova1 = new Jutge(null, null);
		assertNull("El nom del jutge no pot ser null", prova1.getNom_Jutge());
		assertNull("Els cognoms del jutge no poden ser null",
				prova1.getCognoms_Jutge());
		Acusat prova2 = new Acusat(null, null);
		assertNull("El nom del acusat no pot ser null", prova2.getNom_Acusat());
		assertNull("Els cognoms del acusat no poden ser null",
				prova2.getCognoms_Acusat());
		Sala prova3 = new Sala(null, false);
		assertNull("L'ID de la sala no pot ser null", prova3.getId_Sala());
		assertFalse("La sala ha d'estar lliure", prova3.isLliure());
		String delicte = null;
		assertNull("El titol del delicte no pot ser null", delicte);
	}

	/*
	 * Feim una execucio de proves: Provam que la sentencia s'ha aplicat
	 * correctament.
	 */
	@Test
	public void testSentencia_Execucio() throws ParseException {
		Jutjat prova = new Jutjat();

		Jutge Mauricio = new Jutge("Mauricio", "Colmenero");
		Acusat Mario = new Acusat("Mario", "Bros");
		Sala Segona = new Sala("2A", true);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
		Cas denuncia_1 = prova.nou_cas(Mario, Mauricio, Segona,
				"Comerç de drogues.", sdf.parse("05/03/2014"), sdf.parse("10/03/2014"));
		boolean sentencia = true;
		prova.sentencia(denuncia_1, sentencia);
		ArrayList<Cas> proves;
		proves = prova.getLlistaCasos();
		boolean comprovar = false;
		for (int i = 0; i < proves.size(); i++) {
			if (proves.get(i).equals(denuncia_1)) {
				if (proves.get(i).isSentencia() == sentencia) {
					comprovar = true;
					break;
				}
			}
		}
		if (!comprovar) {
			fail("La sentencia no s'ha guardat");
		}
	}

}
