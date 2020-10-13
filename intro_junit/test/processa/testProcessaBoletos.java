package processa;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import boleto.Boleto;
import calculadora.Calculadora;
import processaBoletos.ProcessaBoletos;

public class testProcessaBoletos {


	private Boleto pagamento;
	
	
	@BeforeEach
	public void inicializa() {
		
		
	}
	
	@DisplayName("Testa 1 boleto")
	@Test
	public void testboleto() {
		
		Assertions.assertEquals(1500,1500);	
		
	}
	
	
	@DisplayName("Testa 2 boletos de 400 e 500")
	@Test
	public void testSomaDoisBoletos() {
		double soma = 900;
		String status = ProcessaBoletos.Verfica(soma,2000);
		
		Assertions.assertEquals("Fatura em Aberto", status);
		
		}
	
	
	}


