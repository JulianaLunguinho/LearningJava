import java.util.Arrays;

public class ordenarArray {
	public static void main(String[] args) {
		int[] numeros = {52, 35, 95, 21, 14, 31, 5, 0};
		
		ordenaArray(numeros);
	}
	
	public static void ordenaArray(int[] array) {
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
	}
}
 /*Faça um programa que carregue de maneira ordenada (crescente) um array de 8 elementos.*/
