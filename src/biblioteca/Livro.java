package biblioteca;

public class Livro {

	private String nomeDoLivro;
	private int numeroDePaginas;
	private Autor autorDoLivro;
	private int numeroDeVezesEmQueFoiAlugado;
	private int codigoDoLivro;
	public String disponibilidadeParaAlugar;

	public Livro(String nomeDoLivro, int numeroDePaginas, Autor autorDoLivro, String disponibilidadeParaAlugar, int codigoDoLivro, int numeroDeVezesEmQueFoiAlugado) {
		this.nomeDoLivro = nomeDoLivro;
		this.numeroDePaginas = numeroDePaginas;
		this.autorDoLivro = autorDoLivro;
		this.disponibilidadeParaAlugar = "disponivel";
		this.codigoDoLivro = codigoDoLivro;
		this.setNumeroDeVezesEmQueFoiAlugado(0);
	}

	public String verificarDisponibilidade(String disponibilidadeParaAlugar) {
		if (disponibilidadeParaAlugar == "disponivel") {
			return "possivel alugar";
		} else {
			return "nao e possivel alugar";
		}
	}

	public int getNumeroDeVezesEmQueFoiAlugado() {
		return numeroDeVezesEmQueFoiAlugado;
	}

	public void setNumeroDeVezesEmQueFoiAlugado(int numeroDeVezesEmQueFoiAlugado) {
		this.numeroDeVezesEmQueFoiAlugado = numeroDeVezesEmQueFoiAlugado;
	}


}
