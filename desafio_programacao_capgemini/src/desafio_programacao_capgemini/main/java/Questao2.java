package desafio_programacao_capgemini.main.java;

import java.util.ArrayList;

public class Questao2 {

	/**
	 * - Método responsável por verificar o número de elementos pares de um vetor
	 * que tem uma diferença igual o valor de x.
	 * 
	 * @param array
	 * @param x
	 * @return int
	 */
	public static int vetorVerificaTeste(ArrayList<Integer> array, int x) {
		int total = 0;
		for (int i = 0; i < array.size(); i++) {
			for (int j = 0; j < array.size(); j++) {
				if (array.get(i) - array.get(j) == x) {
					total += 1;
				}
			}
		}

		return total;
	}
}
