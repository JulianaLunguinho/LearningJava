package Main;

import java.util.List;
import java.util.ArrayList;

public class Pessoa {
	
	/*Atributos*/
	
	private Pessoa mae;
	private Pessoa pai;
	private List<Pessoa> filhos = new ArrayList<>();
	
	/*Construtor*/
	
	public Pessoa(Pessoa mae, Pessoa pai) {
		super();
		this.mae = mae;
		this.pai = pai;
		
		if(mae != null) {
			mae.setFilhos(this);
		}
		if(pai != null) {
			pai.setFilhos(this);
		}
	}
	
	/*Getters and Setters */

	public Pessoa getMae() {
		return mae;
	}

	public Pessoa getPai() {
		return pai;
	}

	public List<Pessoa> getFilhos() {
		return filhos;
	}

	public void setFilhos(Pessoa filho) {
		this.filhos.add(filho);
	}
	
		
	
	/*Methodos*/

	public boolean maede(Pessoa filho) {
		return this.filhos.contains(filho);
	}
	
	public boolean paide(Pessoa filho) {
		return this.filhos.contains(filho);
	}
	
	public boolean filhode(Pessoa maeOuPai) {
		return maeOuPai.filhos.contains(this);
	}
	
}
