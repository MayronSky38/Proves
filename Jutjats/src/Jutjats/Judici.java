package Jutjats;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Judici {
/**
 * Classe executable del projecte jutjats.
 */
	public static void main(String[] args) throws ParseException {
		Jutjat judici_1 = new Jutjat();
		Jutge Mauricio = new Jutge("Mauricio", "Colmenero");
		Acusat Mario = new Acusat("Mario", "Bros");
		Sala Segona = new Sala("2A", true);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
		Cas denuncia_1 = judici_1.nou_cas(Mario, Mauricio, Segona,
				"Comerç de drogues.", sdf.parse("05/03/2014"), sdf.parse("10/03/2014"));

		judici_1.casos_Acusat(new Acusat("Mario", "Bros"));
		judici_1.casos_Jutge(new Jutge("Mauricio", "Colmenero"));

		judici_1.sentencia(denuncia_1, true);
	}
}
