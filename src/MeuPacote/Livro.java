package MeuPacote;

public class Livro {
	String nomeDoLivro;
	Autor autor = new Autor();
	int numeroDeSerie;

	public class Autor {
		String nomeDoAutor;
		int idadeDoAutor;
		String formacaoAcademicaDoAutor;
	}

	String situacaoAtual;

	public String locarLivro(){
		verificarDisponibilidade(situacaoAtual);
		situacaoAtual = "nao disponivel";
		
		
	private String verificarDisponibilidade(String situacaoAtual) {
		if (situacaoAtual == "disponivel") {
			return situacaoAtual;
		} else {
			return "Livro ja locado.";
		}
	}	
	}

	private void verificarDisponibilidade(String situacaoAtual) {
		if (situacaoAtual == "disponivel" ) {
			return //definirPrazo()
		} else {
			return //mensagemDeLivroIndisponivel();
		}
	}

	private void devolverLivro() {
		situacaoAtual = "disponivel";
	}
}
