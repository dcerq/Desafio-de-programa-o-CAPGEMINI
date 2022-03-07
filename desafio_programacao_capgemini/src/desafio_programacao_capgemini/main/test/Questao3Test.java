package desafio_programacao_capgemini.main.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import desafio_programacao_capgemini.main.java.Questao3;

public class Questao3Test {
	
	private static final String VALOR_ESPERADO = "tenhaumbomdia";
	
	@Test
	public void encriptaTextTest() {
//		assertEquals(VALOR_ESPERADO, Questao3.encriptaTexto("tenha um bom dia"));
		Questao3.encriptaTexto("tenha um bom dia");
	}

}
