package biblioteca;

import java.util.ArrayList;

public class Aluno {

	private String nomeDoAluno;
	private String registroDoAluno;
	private ArrayList<Livro> livrosAlugados;
	private int indice = 0;

	public Aluno(String nomeDoAluno, String registroDoAluno) {
		this.nomeDoAluno = nomeDoAluno;
		this.registroDoAluno = registroDoAluno;
		this.livrosAlugados = new ArrayList<>();
	}

	public void alugarLivros(Livro livroAlugado) {
		if (indice <= 0) {
			this.livrosAlugados.add(livroAlugado);
			indice++;
		} else {
			System.out.println("Não é possível locar esse livro.");
		}
		
	}

	public String getNomeDoAluno() {
		return nomeDoAluno;
	}

	public int getQuantidadeDeLivrosAlugados() {
		return livrosAlugados.size();
	}

}