package biblioteca;

import java.util.ArrayList;

public class Aluno {

	private String nomeDoAluno;
	private String registroDoAluno;
	private ArrayList<Livro> livrosAlugados;
	boolean livroJaAlugado = false;
	
	public Aluno(String nomeDoAluno, String registroDoAluno) {
		this.nomeDoAluno = nomeDoAluno;
		this.registroDoAluno = registroDoAluno;
		this.livrosAlugados = new ArrayList<>();
	}

	public void alugarLivros(Livro livroAlugado) {
		if (!livroJaAlugado){
			this.livrosAlugados.add(livroAlugado);
			livroJaAlugado = true;
		} else {
			System.out.println("n�o da pra alugar");
		}
	}

	public String getNomeDoAluno() {
		return nomeDoAluno;
	}

	public int getQuantidadeDeLivrosAlugados() {
		return livrosAlugados.size();
	}

}