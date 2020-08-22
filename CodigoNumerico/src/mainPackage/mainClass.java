package mainPackage;

import java.util.Arrays;

public class mainClass {
	
	public static double[] retornaArray(int cod, double[] lista) {
		if(cod == 1) {
			return lista;
		} else if(cod == 2) {
			double[] listaInvertida = new double[5];
			int c = 0;
			
			for ( int i =  lista.length - 1 ; i >= 0 ; i-- ) {
				listaInvertida[c] = lista[i];
				c++;
			}
			
			return listaInvertida;
		} else {
			return null;
		}
	}
	
	public static void main(String[] args) {
		double[] minhaLista = {0,3,5,6,1};
		
		System.out.println(Arrays.toString(retornaArray(0, minhaLista)));
	}

}
/*6- Faça um programa que leia um código numérico inteiro e um array de cinco posições
de números reais. Se o código for zero, termine o programa. Se o código for 1, mostre o
array na ordem direta. Se o código for dois mostre o array na ordem inversa.*/