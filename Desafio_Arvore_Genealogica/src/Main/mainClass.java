package Main;

public class mainClass {
	
	public static boolean temAmesmaMae(Pessoa filho1, Pessoa filho2) {
		return filho1.getMae() == filho2.getMae();
	}
	
	public static boolean temOmesmoPai(Pessoa filho1, Pessoa filho2) {
		return filho1.getPai() == filho2.getPai();
	}
	
	public static String saoIrmaos(Pessoa filho1, Pessoa filho2) {
		if(temAmesmaMae(filho1, filho2) && temOmesmoPai(filho1,filho2)) {
			return "São irmãos.";
		} else if(temAmesmaMae(filho1, filho2) || temOmesmoPai(filho1,filho2)) {
			return"São meio irmãos.";
		} else {
			return "Não são irmãos.";
		}
	}
	
	public static void main(String[] args) {
		
		Pessoa pai1 = new Pessoa(null, null);
		Pessoa mae1 = new Pessoa(null, null);
		
		Pessoa cirlene = new Pessoa(mae1, pai1);
		Pessoa valdir = new Pessoa(mae1, pai1);
		Pessoa patricia = new Pessoa(mae1, pai1);
		Pessoa paulo = new Pessoa(mae1, pai1);		
		
		Pessoa juliana = new Pessoa(cirlene, valdir);
		Pessoa caroline = new Pessoa(cirlene, valdir);
		
		Pessoa gabriel = new Pessoa(patricia, paulo);
		
		Pessoa osvaldo = new Pessoa(cirlene, pai1);
				
	}

}
