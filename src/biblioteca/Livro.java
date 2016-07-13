package biblioteca;

public class Livro {

	private String nomeDoLivro;
	private int numeroDePaginas;
	//private Autor autorDoLivro;
	private int numeroDeVezesEmQueFoiAlugado;
	private int codigoDoLivro;
	public boolean disponibilidadeParaAlugar;
	
	public Livro(String nomeDoLivro, int numeroDePaginas,/* Autor autorDoLivro, */int numeroDeVezesEmQueFoiAlugado, int codigoDoLivro, boolean disponibilidadeParaAlugar) {
		this.nomeDoLivro = nomeDoLivro;
		this.numeroDePaginas = numeroDePaginas;
		//this.autorDoLivro = autorDoLivro;
		this.setNumeroDeVezesEmQueFoiAlugado(0);
		this.codigoDoLivro = codigoDoLivro;
		this.disponibilidadeParaAlugar = true;
	
	}

	public String verificarDisponibilidade(boolean disponibilidadeParaAlugar) {
		
		if (disponibilidadeParaAlugar == true) {
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
