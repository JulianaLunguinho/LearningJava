import java.util.ArrayList;
import java.util.List;

public class exercicio1 {
	
	public static List<String> lista = new ArrayList<>();
	
	public static void main(String[] args) {
		
		lista.add("Pato");
		lista.add("Gato");
		lista.add("Cachorro");
		
		try {
			System.out.println(lista.get(3));
			
		} catch (IndexOutOfBoundsException e){
			e.printStackTrace();	
		}
		
	}
}

/*
Exercício 1:
● Criar um arrayList de Strings e inicializá-lo com uma nova lista vazia.
● Adicionar os seguintes valores: “Pato”, “Cachorro”, “Gato”.
● Imprimir o conteúdo da posição 3.
● Executar o programa. O que acontece?
● Criar uma cláusula try-catch para controlar a exceção anterior. O tipo de
exceção e onde surgiu deverão ser impressos na tela.
*/
