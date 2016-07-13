package biblioteca;

public class Teste {


	public static void main(String[] args) {
		
		Aluno aluno = new Aluno("alcir", "123");

		Autor autor = new Autor("Kathy Sierra");

		Livro livroAlugado = new Livro("java", autor, 200, 555);

		aluno.alugarLivros(livroAlugado);

		System.out.println("Aluno : " + aluno.getNomeDoAluno() + "\nLivros alugados: "
				+ aluno.getQuantidadeDeLivrosAlugados() + "\n");
	
		Aluno outroAluno = new Aluno("diego", "155");
		
		outroAluno.alugarLivros(livroAlugado);
	
		System.out.println("Aluno : " + outroAluno.getNomeDoAluno() + "\nLivros alugados: "
				+ outroAluno.getQuantidadeDeLivrosAlugados() + "\n");
	
	
		
	
	}

}
