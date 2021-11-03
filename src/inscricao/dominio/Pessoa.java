package inscricao.dominio;

import java.util.Date;

public class Pessoa {
	
	private String nome;	
	private String genero;
	private Date dataNascimento;
	private String endereco;
	private String email;
	private boolean especial;
	
	public Pessoa() {  }
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public Date getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public boolean getEspecial() {
		return especial;
	}
	
	public void setEspecial(boolean especial) {
		this.especial = especial;
	}	
}
