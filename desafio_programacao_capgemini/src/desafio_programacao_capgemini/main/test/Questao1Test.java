package desafio_programacao_capgemini.main.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import desafio_programacao_capgemini.main.java.Questao1;
import org.junit.Test;

public class Questao1Test {
	
private static final int VALOR_ESPERADO = 4;

	@Test
	public void mediana_Teste() {
		assertEquals(VALOR_ESPERADO, Questao1.mediana(getVetor()));
		
	}

	public ArrayList<Integer> getVetor() {
		ArrayList<Integer> vetor = new ArrayList<>();
		vetor.add(9);
		vetor.add(2);
		vetor.add(1);
		vetor.add(4);
		vetor.add(6);
		return vetor;
	}
}
