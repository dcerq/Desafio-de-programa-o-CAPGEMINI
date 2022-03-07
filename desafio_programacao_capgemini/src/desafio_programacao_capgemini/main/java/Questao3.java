package desafio_programacao_capgemini.main.java;

import java.util.ArrayList;

public class Questao3 {
	
	public static String encriptaText(String texto) {
		texto = texto.replaceAll("\\s+","");
		Integer t = texto.length();
		int raizDeT = (int) Math.round(Math.sqrt(t));
		
		ArrayList<String> grid = montarArray(texto, raizDeT);
		ArrayList<ArrayList<String>> grid2 = new ArrayList<ArrayList<String>>();
		ArrayList<ArrayList<String>> grid3 = new ArrayList<ArrayList<String>>();
		ArrayList<ArrayList<String>> grid4 = new ArrayList<ArrayList<String>>();
		
		for (int i = 0; i < grid.size(); i++) {
			grid2.add(montarArray(grid.get(i), 1));
		}
		
		for (int i = 0; i < raizDeT; i++) {
			grid4.add(new ArrayList<>());
		}
		
		for (int i = 0; i < grid2.size(); i++) {
			for (int j = 0; j < grid2.get(i).size(); j++) {
				grid4.get(j).set(i, grid2.get(i).get(j));
			}
		}
		
		return texto;
	}
	
	private static ArrayList<String> montarArray(String t, int limite) {
		ArrayList<String> a = new ArrayList<String>();
		int contador = 0;
		String texto = "";
		for (int i = 0; i < t.length(); i++) {
			texto = texto + String.valueOf(t.charAt(i));
			contador += 1;
			if (contador == limite || i== t.length() -1) {
				a.add(texto);
				texto = "";
				contador = 0;
			}
		}
		return a;
	}
}
