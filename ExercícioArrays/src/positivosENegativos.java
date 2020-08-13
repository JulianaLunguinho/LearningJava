import java.util.Arrays;

public class positivosENegativos {
	public static void main(String[] args) {
		int[] numeros = {1, 2, -5, -3, 8, -6, 10, -1};
		
		mostrarPositivosENegativos(numeros);
	}
	
	public static void mostrarPositivosENegativos(int[] array) {
		int[] negativos = new int[8];
		int[] positivos = new int[8];
		int posicaoNegativos = 0;
		int posicaoPositivos = 0;
		
		for(int n : array) {
			if (n < 0) {
				negativos[posicaoNegativos] = n;
				posicaoNegativos++;
			} else {
				positivos[posicaoPositivos] = n;
				posicaoPositivos++;
			}
		}
		System.out.println("Negativos: " + Arrays.toString(negativos));
		System.out.println("Positivos: " + Arrays.toString(positivos));
	}
}

/*Faça um programa que carregue um array com oito números inteiros e mostre dois arrays resultantes. O primeiro array resultante deve conter os números positivos. O segundo array resultante deve conter os números negativos. Cada array resultante vai ter no máximo oito posições, sendo que nem todas devem obrigatoriamente serem utilizadas.*/