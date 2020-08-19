package funcionarios;

public abstract class Administrativo extends Funcionario {
	
	private double bonificacao;
	private String NIT;
	
	public Administrativo(String nome, String CPF, String endereço, String email, String setor, String dataDeAdmissão, double salario, String NIT) {
		super(nome, CPF, endereço, email, setor, dataDeAdmissão, salario);
		this.NIT = NIT;
	}
	
	@Override
	public void receberPagamento() {
		super.holerite = super.salario + this.getBonificacao();	
	}
	
	public abstract void demitir(Funcionario inferior, String data);

	public String getNIT() {
		return NIT;
	}

	public double getBonificacao() {
		return bonificacao;
	}

	public void setBonificacao(double bonificacao) {
		this.bonificacao = bonificacao;
	}

}
