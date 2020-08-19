package funcionarios;

public abstract class Funcionario {
	
	/*Atributos*/
	
	private String nome;
	private String CPF;
	private String endereço;
	private String email;
	private String setor;
	private String dataDeAdmissao;
	private String dataDeDemissao; 
	protected double salario;
	protected double holerite;
	private boolean ferias = false;
	
	/*Gets and Sets*/

	public String getDataDeAdmissão() {
		return dataDeAdmissao;
	}

	public String getSetor() {
		return setor;
	}

	public String getEmail() {
		return email;
	}

	public String getEndereço() {
		return endereço;
	}

	public String getCPF() {
		return CPF;
	}

	public String getNome() {
		return nome;
	}
	
	public double getSalario() {
		return salario;
	}

	public double getHolerite() {
		return holerite;
	}
	
	public String getDataDeDemissão() {
		return dataDeDemissao;
	}
	
	public boolean isFerias() {
		return ferias;
	}

	public void setDataDeDemissão(String dataDeDemissão) {
		this.dataDeDemissao = dataDeDemissão;
	}

	/*Construtor*/
	
	public Funcionario(String nome, String CPF, String endereço, String email, String setor, String dataDeAdmissão, double salario) {
		super();
		this.nome = nome;
		this.CPF = CPF;
		this.endereço = endereço;
		this.email = email;
		this.setor = setor;
		this.dataDeAdmissao = dataDeAdmissão;
		this.salario = salario;
	}
	
	/*Methodos*/

	public abstract void receberPagamento();
	
	public double verFolhaPagamento() {
		return this.holerite;
	}
	
	public String requisitarFerias (int mesesDeEmpresa, int mesesDesdeUltimaFerias) {
		if(mesesDeEmpresa >= 11 && mesesDesdeUltimaFerias >= 4) {
			this.ferias = true;
			return "Boas férias!";
		} else {
			return "Você ainda não pode tirar férias.";
		}
	}
	
	public void voltarDasFérias() {
		this.ferias = false;
	}
	
 	public boolean trabalhar() {
 		if(this.ferias || this.dataDeDemissao != null) {
 			return false; 
 		} else {
 			return true;
 		}
 	}
	
	public void pedirDemissão(String data) {
		this.dataDeDemissao = data;
	}
	
	public void SolicitarAumento(Gerente chefe, double valor) {
		chefe.reajustarSalario(this, valor);		
	}
	
}