package biblioteca;

public class Aluno {
	private String nomeDoAluno;
	private int registroDoAluno;
	/*
	 * private Aluno[] livrosComOALuno = new
	 * Aluno[quantidadeDeLivrosAlugados()];
	 */

	Livro Livro = new Livro("Livro Teste", 200, 0, 1001, true);

	public String alugarLivro() {

		Livro.verificarDisponibilidade(Livro.disponibilidadeParaAlugar);

		if (Livro.disponibilidadeParaAlugar == true) {
			alterarStatusDoLivro();
			// determinarNumeroDeVezesEmQueFoiLivroFoiAlugado();
		} else {
			System.out.println("Não é possível alugar o livro, o mesmo se encontra locado.");
		}
		return "livro locado com sucesso";

	}

	private void alterarStatusDoLivro() {
		boolean disponibilidadeParaAlugar = Livro.disponibilidadeParaAlugar;
		if (Livro.verificarDisponibilidade(disponibilidadeParaAlugar) == "possivel alugar") {
			disponibilidadeParaAlugar = false;
		}
	}

	/*
	 * private void determinarNumeroDeVezesEmQueFoiLivroFoiAlugado() {
	 * Livro.setNumeroDeVezesEmQueFoiAlugado(Livro.
	 * getNumeroDeVezesEmQueFoiAlugado() + 1); } private int
	 * quantidadeDeLivrosAlugados() {
	 * 
	 * return quantidadeDeLivrosAlugados(); }
	 */
}