package exercicio3;

public class CalculoMatematico {
	
	public int divisao(int dividendo, int divisor) {
		
		if(divisor == 0) {
			throw new ArithmeticException("Divisão por zero não pode ser efetuada.");
		}		
		return dividendo/divisor;	
	}

}
