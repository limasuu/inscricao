package inscricao.dominio;

public class Inscricao {

	private Pessoa pessoa;
	private String curso;
	private String unidade;

	public Inscricao() {

		pessoa= new Pessoa();
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}
}
