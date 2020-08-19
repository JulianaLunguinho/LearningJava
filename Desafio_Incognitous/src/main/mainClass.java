package main;

import funcionarios.*;

public class mainClass {
	
	public static void main(String[] args) {
		Gerente Rafael = new Gerente("Rafael", "68745212365", "Rua algumacoisa, 254", "rafael@gmail.com", "Administração", "15/08/2020", 4000, "65882");
		Supervisor Marcela = new Supervisor("Marcela", "66325647811", "Rua dos alfeneiros, 15", "marcela@gmail.com", "SAC", "10/06/2020", 2500, "23569");
		Operador Ricardo = new Operador("Ricardo", "56412132398", "Rua dos girassois, 63", "ricardo@gmail.com", "SAC", "25/07/2020", 1400, "01564");
		
	}	
}
