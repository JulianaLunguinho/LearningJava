package mainPackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaVolumes {

	Map<Integer, List<Peca>> armario = new HashMap<>();
	int contadorChaves = 0;
	
	public int guardarPecas(List<Peca> listaDePecas) {
		contadorChaves++;
		armario.put(contadorChaves, listaDePecas);
		
		return contadorChaves;
	}
	
	public void mostrarPecas() {
		for(int chave : armario.keySet()) {
			List<Peca> gaveta = armario.get(chave);
			
			System.out.println(chave + " : " + gaveta);
		}
	}
	
	public void mostrarPecas(Integer chave) {
		System.out.println(armario.get(chave));
	}
	
	public void devolverPecas(Integer chave) {
		armario.remove(chave);
	}
}
