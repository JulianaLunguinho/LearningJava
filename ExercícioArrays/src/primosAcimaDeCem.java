import java.util.Arrays;

public class primosAcimaDeCem {
	public static int[] primos = new int[10];
	
	public static boolean ePrimo(int num) {
		boolean primo = true;
		
		for(int c = 2; c < num; c++) {
			if(num % c == 0) {
				primo = false;
				break;
			}
		}
		
		return primo;
	}
	
	public static int[] retornarPrimos() {
		
		int i = 100;
		while(primos[primos.length-1] == 0) {
			
			if(ePrimo(i)) {
				for(int c = 0; c < primos.length; c++) {
					if(primos[c] == 0) {
						primos[c] = i;
						break;
					}
				}
			}			
			i++;
		}		
		return primos;
	}
	
	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(retornarPrimos()));
	}

}
/*7 – Faça um programa que gere os dez primeiros números primos acima de 100 e
armazene-os em um array, escrevendo ao final o array resultante.*/