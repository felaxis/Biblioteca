package biblioteca;

public class Livro {

	private String nomeDoLivro;
	private int numeroDePaginas;
	private Autor autor;
	private int codigoDoLivro;

	public Livro(String nomeDoLivro, Autor autor, int numeroDePaginas, int codigoDoLivro) {
		this.nomeDoLivro = nomeDoLivro;
		this.numeroDePaginas = numeroDePaginas;
		this.autor = autor;
		this.codigoDoLivro = codigoDoLivro;

	}

}
