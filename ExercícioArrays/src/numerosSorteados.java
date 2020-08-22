import java.util.Arrays;

public class numerosSorteados {
	public static int[] numerosDoSorteio = new int[20];
	
	public static void addNumeroSorteado(int numeroSorteado) {
		
		for(int i = 0; i < 20; i++) {
			if(numerosDoSorteio[i] == 0) {
				numerosDoSorteio[i] = numeroSorteado;
				break;				
			}
		}
		
		System.out.println(mostrarResultadoSorteio());
	}
	
	public static String mostrarResultadoSorteio() {
		
		int seis = 0;
		int cinco= 0;
		int quatro = 0;
		int tres = 0;
		int dois = 0;
		int um = 0;
	
		if(numerosDoSorteio[19] != 0) {
			for(int n : numerosDoSorteio) {
				switch(n) {
				case 1: um++;
				break;
				case 2: dois++;
				break;
				case 3: tres++;
				break;
				case 4: quatro++;
				break;
				case 5: cinco++;
				break;
				case 6: seis++;
				break;
				}
			}
			
			return "Os números sorteados foram: " + Arrays.toString(numerosDoSorteio) + 
			". O número 6 foi sorteado " + seis + " vezes. O número 5 foi sorteado " 
			+ cinco + " vezes. O número 4 foi sorteado " + quatro + 
			" vezes. O número 3 foi sorteado " + tres + " vezes. O número 2 foi sorteado " 
			+ dois + " vezes. E o número 1 foi sorteado " + um + " vezes.";
		} else {
			return Arrays.toString(numerosDoSorteio);
		}
	}
	
	public static void main(String[] args) {
		
		addNumeroSorteado(1);
		addNumeroSorteado(6);
		addNumeroSorteado(3);
		addNumeroSorteado(1);
		addNumeroSorteado(5);
		addNumeroSorteado(2);
		addNumeroSorteado(3);
		addNumeroSorteado(1);
		addNumeroSorteado(4);
		addNumeroSorteado(6);
		addNumeroSorteado(4);
		addNumeroSorteado(5);
		addNumeroSorteado(2);
		addNumeroSorteado(3);
		addNumeroSorteado(6);
		addNumeroSorteado(5);
		addNumeroSorteado(1);
		addNumeroSorteado(5);
		addNumeroSorteado(3);
		addNumeroSorteado(4);
	}
}
/*5 – Faça um programa que receba o número sorteado em um dado durante 20 jogadas, mostre os números sorteados e a frequência com que aparecem.*/