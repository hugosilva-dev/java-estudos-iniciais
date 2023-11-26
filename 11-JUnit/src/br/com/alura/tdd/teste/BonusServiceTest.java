package br.com.alura.tdd.teste;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.service.BonusService;

class BonusServiceTest {

	@Test
	void bonusDeveriaSerZeroParaFuncionarioComSalarioMuitoAlto() {
		BonusService service = new BonusService();
		
		//Método 01 para testes com exceções:
//		assertThrows(IllegalArgumentException.class,
//		() -> service.calcularBonus(new Funcionario("Hugo", LocalDate.now(), new BigDecimal("25000"))));
		
		//Método 02 para testes com exceções:
		try {
			service.calcularBonus(new Funcionario("Hugo", LocalDate.now(), new BigDecimal("25000")));
			fail("Não deu a exception!"); //método para forçar a falha!
		} catch (Exception e) {
			assertEquals("Funcionário com salário maior do que R$10.000,00 não pode receber bônus!", e.getMessage());
		}
	}
		
	@Test
	void bonusDeveriaSer10PorCentoDoSalario() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Hugo", LocalDate.now(), new BigDecimal("2500")));
		
		assertEquals(new BigDecimal("250.00"), bonus);
	}
	
	@Test
    void bonusDeveriaSerDezPorCentoParaSalarioDeExatamente10000() {
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus (new Funcionario("Hugo", LocalDate.now(), new BigDecimal("10000")));

        assertEquals(new BigDecimal("1000.00"), bonus);
        
    }

}
