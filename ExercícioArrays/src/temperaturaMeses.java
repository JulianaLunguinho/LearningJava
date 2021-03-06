
public class temperaturaMeses {
	public static String[] meses;
	public static int[] temperaturas;
	public static int posicao;
	
	public static void main(String[] args) {
		meses = new String[12];
		temperaturas = new int[12];
		posicao = 0;
		
		mostraTemperaturas("Janeiro", 25);
		mostraTemperaturas("Fevereiro", 20);
		mostraTemperaturas("Março", 30);
		mostraTemperaturas("Abril", 21);
	}
	
	public static void mostraTemperaturas(String mes, int temperatura) {
		meses[posicao]=mes;
		temperaturas[posicao]=temperatura;
		posicao++;
		
		int menorTemperatura = temperaturas[0];
		String mesDaMenorTemperatura = meses[0];
		int maiorTemperatura = temperaturas[0];
		String mesDaMaiorTemperatura = meses[0];
		
		for(int i = 0; i < temperaturas.length; i++) {			
			if(temperaturas[i] < menorTemperatura && temperaturas[i] != 0) {
				menorTemperatura = temperaturas[i];
				mesDaMenorTemperatura = meses[i];
			}
			if(temperaturas[i] > maiorTemperatura) {
				maiorTemperatura = temperaturas[i];
				mesDaMaiorTemperatura = meses[i];
			}
		}
		
		System.out.println("Até agora, a maior média de temperatura foi " + maiorTemperatura + 
				" graus em " + mesDaMaiorTemperatura + ". E a menor média de temperatura foi " + 
				menorTemperatura + " graus em " + mesDaMenorTemperatura + ".");
	}
}

/*Faça um programa que receba a temperatura média de cada mês do ano e armazene-as em um array. Mostre a maior e a menor temperatura do ano e em que mês elas ocorreram (mostrar o mês por extenso: 1 – janeiro, 2 –fevereiro, ...).
Obs: Desconsiderar empates.*/

