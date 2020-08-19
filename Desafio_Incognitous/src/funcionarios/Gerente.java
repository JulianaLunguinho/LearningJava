package funcionarios;

public class Gerente extends Administrativo{

	public Gerente(String nome, String CPF, String endereço, String email, String setor, String dataDeAdmissão,
			double salario, String NIT) {
		super(nome, CPF, endereço, email, setor, dataDeAdmissão, salario, NIT);
		this.setBonificacao(0.12 * super.salario);
	}

	@Override
	public void demitir(Funcionario subordinado, String data) {
		if(subordinado instanceof Supervisor || subordinado instanceof Operador) {
			subordinado.setDataDeDemissão(data);
		}
	}
	
	public String reajustarSalario(Funcionario subordinado, double novoValor) {
		
		if((subordinado instanceof Supervisor || subordinado instanceof Operador) && novoValor < subordinado.salario * 1.10 && novoValor > subordinado.salario) {
			subordinado.salario = novoValor;
			return "Salário ajustado para " + novoValor + ".";
		} else {
			return "Não foi possível reajustar o salário.";
		}
	}

}
