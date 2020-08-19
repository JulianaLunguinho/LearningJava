package funcionarios;

public class Supervisor extends Administrativo{

	public Supervisor(String nome, String CPF, String endereço, String email, String setor, String dataDeAdmissão,
			double salario, String NIT) {
		super(nome, CPF, endereço, email, setor, dataDeAdmissão, salario, NIT);
		this.setBonificacao(0.08 * super.salario);
	}

	@Override
	public void demitir(Funcionario subordinado, String data) {
		if(subordinado instanceof Operador) {
			subordinado.setDataDeDemissão(data);
		}
	}
}
