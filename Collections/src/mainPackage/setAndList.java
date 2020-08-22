package mainPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class setAndList {
	
	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<>(Arrays.asList(1,5,5,6,7,8,8,8));	
		
		System.out.println(lista);
		
		Set<Integer> conjunto = new HashSet<>(Arrays.asList(1,5,5,6,7,8,8,8));
		
		System.out.println(conjunto);
	}
}
/*3. Definir e inicializar uma nova lista vazia. Adicionar os seguintes elementos à
lista vazia: 1,5,5,6,7,8,8,8.
Imprimir o resultado na tela.

4. Definir e inicializar um novo conjunto vazio. Adicionar os seguintes elementos
ao conjunto vazio: 1,5,5,6,7,8,8,8.
Imprimir o resultado na tela. Qual é a diferença entre este exercício e o anterior?*/