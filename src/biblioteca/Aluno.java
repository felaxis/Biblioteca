package biblioteca;


public class Aluno {
	private String nomeDoAluno;
	private int registroDoAluno;
/*	private Aluno[] livrosComOALuno = new Aluno[quantidadeDeLivrosAlugados()]; */

	public String alugarLivro() {
		Livro.verificarDisponibilidade(Livro.disponibilidadeParaAlugar);
		if (Livro.disponibilidadeParaAlugar == "disponivel") {
			alterarStatusDoLivro();
			determinarNumeroDeVezesEmQueFoiLivroFoiAlugado();
		} else {
			System.out.println("Não é possível alugar o livro, o mesmo se encontra locado.");
		}

	}

	private void alterarStatusDoLivro() {
		String disponibilidadeParaAlugar = Livro.disponibilidadeParaAlugar;
		if (Livro.verificarDisponibilidade(disponibilidadeParaAlugar) == "disponivel") {
			disponibilidadeParaAlugar = "indisponivel";
		}
	}

	/*private void determinarNumeroDeVezesEmQueFoiLivroFoiAlugado() {
		Livro.setNumeroDeVezesEmQueFoiAlugado(Livro.getNumeroDeVezesEmQueFoiAlugado() + 1);
	}
	private int quantidadeDeLivrosAlugados() {
				
		return quantidadeDeLivrosAlugados();
	}*/
}