package mainPackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class apelidos {
	
	public static void main(String[] args) {
		Map<String, String[]> apelidosPorAmigo = new HashMap<>();
		
		
		String[] apelidos1 = {"Juan", "Fissura", "Maromba"};
		String[] apelidos2 = {"Night Watch", "Bruce Wayne", "Tampinha"};
		String[] apelidos3 = {"Wonder Woman", "Mary", "Marilene"};
		String[] apelidos4 = {"Lukinha", "Jorge", "George"};
		
		apelidosPorAmigo.put("João", apelidos1);
		apelidosPorAmigo.put("Miguel", apelidos2);
		apelidosPorAmigo.put("Maria", apelidos3);
		apelidosPorAmigo.put("Lucas", apelidos4);
		
		for(String amigo : apelidosPorAmigo.keySet()) {
			System.out.println(amigo + Arrays.toString(apelidosPorAmigo.get(amigo)));
		}
	}
}

/*2. Criar um dicionário que represente os apelidos que uso para chamar os
meus amigos. Para isso, o dicionário deverá ter como chave String e como
valor uma lista de Strings.

João → Juan, Fissura, Maromba
Miguel → Night Watch, Bruce Wayne, Tampinha
Maria → Wonder Woman, Mary, Marilene
Lucas → Lukinha, Jorge, George

Em seguida crie uma classe Exercício 1 com seu método main, imprimir no Main
todas as chaves junto com seus valores associados. Para isso, utilizar o
foreach com as chaves.*/



