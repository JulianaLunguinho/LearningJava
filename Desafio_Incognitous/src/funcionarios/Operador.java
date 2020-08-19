package funcionarios;

public class Operador extends Funcionario{
	
	private String NITorCNPJ;

	public Operador(String nome, String CPF, String endereço, String email, String setor, String dataDeAdmissão,
			double salario, String NITorCNPJ) {
		super(nome, CPF, endereço, email, setor, dataDeAdmissão, salario);
		this.NITorCNPJ = NITorCNPJ;
	}

	@Override
	public void receberPagamento() {
		super.holerite = super.salario;
	}

}
