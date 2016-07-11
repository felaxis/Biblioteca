package MeuPacote;

public class Livro {
	String nomeDoLivro;
	Autor autor = new Autor();
	int numeroDeSerie;
	int numeroDeVezesEmQueFoiLocado = 0;

	public class Autor {
		String nomeDoAutor;
		int idadeDoAutor;
		String formacaoAcademicaDoAutor;
	}

	String situacaoAtual;

	public String locarLivro() {
		verificarDisponibilidade(situacaoAtual);
		return situacaoAtual = "nao disponivel";
	}

	private String verificarDisponibilidade(String situacaoAtual) {
		if (situacaoAtual == "disponivel" ) {
			numeroDeVezesEmQueFoiLocado++;
			return //definirPrazo()
		} else {
			mensagemDeLivroIndisponivel();
		}
	}

	private String mensagemDeLivroIndisponivel() {
		System.out.println("Livro n�o disponivel para empr�stimo.");
		return null;
	}

	private void devolverLivro() {
		situacaoAtual = "disponivel";
	}
}
