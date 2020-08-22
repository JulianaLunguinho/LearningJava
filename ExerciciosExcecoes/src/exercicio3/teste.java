package exercicio3;

public class teste {
	
	public static void main(String[] args) {
		CalculoMatematico calculadora = new CalculoMatematico();
		
		try {
			calculadora.divisao(4, 0);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
}
