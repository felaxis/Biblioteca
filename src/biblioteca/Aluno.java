package biblioteca;

import java.util.ArrayList;

public class Aluno {

	private String nomeDoAluno;
	private String registroDoAluno;
	private ArrayList<Livro> livrosAlugados;

	public Aluno(String nomeDoAluno, String registroDoAluno) {
		this.nomeDoAluno = nomeDoAluno;
		this.registroDoAluno = registroDoAluno;
		this.livrosAlugados = new ArrayList<>();
	}

	public void alugarLivros(Livro livroAlugado) {
		this.livrosAlugados.add(livroAlugado);
	}

	public void verificarSeLivroJaEstaAlugado(Livro livroAlugado) {
		for (int indice = 0; indice <= getQuantidadeDeLivrosAlugados(); indice++) {
				if (Livro nomeDoLivro == livrosAlugados.get(indice)){
					
				};
		}
	}

	public String getNomeDoAluno() {
		return nomeDoAluno;
	}

	public int getQuantidadeDeLivrosAlugados() {
		return livrosAlugados.size();
	}

}