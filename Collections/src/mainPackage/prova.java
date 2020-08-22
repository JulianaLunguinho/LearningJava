package mainPackage;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class prova {
	public static void somaTotal(Set<Integer> conjuntoDeInteiros) {
		int soma = 0;
		for(int valor : conjuntoDeInteiros) {
			soma = soma + valor;
		}
		System.out.println(soma);
	}
	
	public static void main(String[] args) {
		Set<Integer> inteiros = new HashSet<>(Arrays.asList(1,3,5,9,8,17,25));
		
		somaTotal(inteiros);		
	}
}
/*Criar uma nova classe chamada Prova. Definir e implementar o seguinte método:
public void somaTotal(Set<Integer> conjuntoDeInteiros)
O método deve percorrer o conjunto de inteiros, ir acumulando o total da soma
dos valores e, no final, imprimir na
tela o valor da soma total.*/