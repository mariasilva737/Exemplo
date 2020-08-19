package exemplo;

import java.util.Date;

public class Pessoa {

	int id;
	String nome, email, telefone, cpf, matricula;
	Cargo cargo;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Enum<Cargo> getCargo() {
		return cargo;
	}
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public Date getData_admissao() {
		return data_admissao;
	}
	public void setData_admissao(Date data_admissao) {
		this.data_admissao = data_admissao;
	}
	Date data_admissao;
	public Pessoa(int id, String nome, String email, String telefone, Cargo cargo, String cpf, String matricula,
			Date data_admissao) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.cargo = cargo;
		this.cpf = cpf;
		this.matricula = matricula;
		this.data_admissao = data_admissao;
	}
	public Pessoa(String nome, String email, String telefone, Cargo cargo, String cpf, String matricula,
			Date data_admissao) {
		super();
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.cargo = cargo;
		this.cpf = cpf;
		this.matricula = matricula;
		this.data_admissao = data_admissao;
	}
	
	public Pessoa(String nome, String email, String telefone, Cargo cargo, String cpf, String matricula) {
		super();
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.cargo = cargo;
		this.cpf = cpf;
		this.matricula = matricula;
		
}
	public Pessoa() {
		// TODO Auto-generated constructor stub
	}
}
