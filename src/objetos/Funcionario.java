package objetos;

public class Funcionario {

	private int id_funcionario;
	private String nome_funcionario;
	private double salario_funcionario;
	
	public Funcionario(int id_funcionario, String nome_funcionario, double salario_funcionario) {
		super();
		this.id_funcionario = id_funcionario;
		this.nome_funcionario = nome_funcionario;
		this.salario_funcionario = salario_funcionario;
	}

	public int getId_funcionario() {
		return id_funcionario;
	}

	public void setId_funcionario(int id_funcionario) {
		this.id_funcionario = id_funcionario;
	}

	public String getNome_funcionario() {
		return nome_funcionario;
	}

	public void setNome_funcionario(String nome_funcionario) {
		this.nome_funcionario = nome_funcionario;
	}

	public double getSalario_funcionario() {
		return salario_funcionario;
	}

	public void setSalario_funcionario(double salario_funcionario) {
		this.salario_funcionario = salario_funcionario;
	}
	
	public  void incremento_salario (double percentual) {
		
		salario_funcionario = salario_funcionario + 0.1*(percentual)*salario_funcionario;
	}

	public Integer getId() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
