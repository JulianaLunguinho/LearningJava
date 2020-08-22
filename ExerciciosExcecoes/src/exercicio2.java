import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class exercicio2 {
	
	public static void main(String[] args) {
		List<String> animais = new ArrayList<>(Arrays.asList("Pato", "Cachorro", "Gato"));
		
		try {
			System.out.println(animais.get(2));
			
		} catch (NullPointerException e) {
			e.printStackTrace();			
		}
				
		try {
			System.out.println(animais.get(5));
			
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}

}
/*
Exercício 2:
● Criar um arrayList de Strings e inicializá-lo com null.
● Adicionar os seguintes valores: “Pato”, “Cachorro”, “Gato”.
● Imprimir o conteúdo da posição 2.
● Executar o programa. O que acontece?
● Criar uma cláusula try-catch para controlar a exceção anterior. O tipo de
exceção e onde surgiu deverão ser impressos na tela.
● Modificar a inicialização do arrayList anterior e inicializá-lo com uma lista
vazia.
● Agora, imprimir o conteúdo da posição 5.
● Executar o programa. O que acontece?
● Criar outra cláusula catch para controlar a exceção anterior. O tipo de
exceção e onde surgiu deverão ser impressos na tela.
*/
