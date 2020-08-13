public class mostrarPrimos {
	public static void main(String[] args) {
		int[] numeros = {1, 9, 2, 3, 5, 15, 20, 23, 31};
		
		mostraPrimos(numeros);
	}
	
	public static void mostraPrimos (int[] array) {
		for(int numero : array) {
			Boolean primo = true;
			for(int i = 2; i < numero; i++) {
				if(numero%i == 0) {
					primo = false;
					break;
				}
			}
			if(primo) {
				System.out.println(numero);
			}
		}
	}
}

/*Faça um programa que carregue um array de nove elementos numéricos inteiros e
mostre os números primos e suas respectivas posições.*/