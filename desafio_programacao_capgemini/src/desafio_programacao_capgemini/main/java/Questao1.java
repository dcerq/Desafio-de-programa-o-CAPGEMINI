package desafio_programacao_capgemini.main.java;

import java.util.ArrayList;
import java.util.Collections;

public class Questao1 {

	/**
	 * - Método responsável por ordenar uma lista e retornar a mediana.
	 * 
	 * @param array
	 * @return Object
	 */
	public static Object mediana(ArrayList<Integer> array) {
		Collections.sort(array);
		return array.get((array.size() - 1) / 2);
	}

}
