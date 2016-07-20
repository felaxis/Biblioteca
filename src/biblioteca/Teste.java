package biblioteca;

public class Teste {

	public static void main(String[] args) {
		
		
		Aluno aluno = new Aluno("alcir", "123");

		Autor autor = new Autor("Kathy Sierra");
		
		Aluno outroAluno = new Aluno("diego", "332");

		Livro livroAlugado = new Livro("java", autor, 200, 555);

		aluno.alugarLivros(livroAlugado);
		aluno.alugarLivros(livroAlugado);
		
		System.out.println("Aluno : " + aluno.getNomeDoAluno() + "\nLivros alugados: "
				+ aluno.getQuantidadeDeLivrosAlugados() + "\n");
		
		/* outroAluno.alugarLivros(livroAlugado);
		
		System.out.println("Aluno : " + outroAluno.getNomeDoAluno() + "\nLivros alugados: "
				+ outroAluno.getQuantidadeDeLivrosAlugados() + "\n");
*/
	}

}
