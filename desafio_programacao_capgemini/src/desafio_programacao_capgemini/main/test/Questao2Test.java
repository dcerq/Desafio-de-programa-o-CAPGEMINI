package desafio_programacao_capgemini.main.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import desafio_programacao_capgemini.main.java.Questao2;

public class Questao2Test {

	private static final int VALOR_ESPERADO = 3;

	@Test
	public void vetorVerificaTeste() {
		assertEquals(VALOR_ESPERADO, Questao2.vetorVerificaTeste(getVetor(), 2));

	}

	public ArrayList<Integer> getVetor() {
		ArrayList<Integer> vetor = new ArrayList<>();
		vetor.add(1);
		vetor.add(5);
		vetor.add(3);
		vetor.add(4);
		vetor.add(2);
		return vetor;
	}

}
