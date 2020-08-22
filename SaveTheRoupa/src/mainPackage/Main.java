package mainPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		GuardaVolumes guardaVolume = new GuardaVolumes();
		Roupa peca1 = new Roupa("Onbongo", "Casaco");
		Roupa peca2 = new Roupa("Bad Cat", "Camiseta");
		
		List<Peca> pecas = new ArrayList<>(Arrays.asList(peca1, peca2));
		
		System.out.println(guardaVolume.guardarPecas(pecas));
		
		guardaVolume.devolverPecas(1);
		
	}
}

/*7. Na classe Main, criar um cenário em que alguém guarda duas peças,
recebe o código e depois retira suas peças.*/