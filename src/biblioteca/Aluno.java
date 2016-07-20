package biblioteca;

import java.util.ArrayList;

public class Aluno {

	private String nomeDoAluno;
	private String registroDoAluno;
	private ArrayList<Livro> livrosAlugados;
	private boolean livroJaAlugado = false;

	public Aluno(String nomeDoAluno, String registroDoAluno) {
		this.nomeDoAluno = nomeDoAluno;
		this.registroDoAluno = registroDoAluno;
		this.livrosAlugados = new ArrayList<>();
	}

	public void alugarLivros(Livro livroAlugado) {

		if (!livroJaAlugado) {
			this.livrosAlugados.add(livroAlugado);
			System.out.println("conseguiu alugar");
			
			setLivroJaAlugado(livroJaAlugado);
			setLivroJaAlugado(true);
		} else {
			System.out.println("livro ja  alugado");
		}
	}
	public  String getNomeDoAluno(){
		return nomeDoAluno;
	}
	public int getQuantidadeDeLivrosAlugados() {
		return livrosAlugados.size();
	}

	public boolean getLivroJaAlugado() {
		return livroJaAlugado;
	}

	public void setLivroJaAlugado(boolean livroJaAlugado) {
		this.livroJaAlugado = livroJaAlugado;
	}

}