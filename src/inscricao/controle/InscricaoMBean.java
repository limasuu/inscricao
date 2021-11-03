package inscricao.controle;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import inscricao.dominio.Inscricao;

@ManagedBean
@SessionScoped
public class InscricaoMBean {
	
	Inscricao inscricao;
	
	public InscricaoMBean() {
		
		inscricao= new Inscricao();
	}

	public Inscricao getInscricao() {
		return inscricao;
	}

	public void setInscricao(Inscricao inscricao) {
		this.inscricao = inscricao;
	}
	
	public String inscrever() {
		
		return "confirmacao.jsf";
	}

}
