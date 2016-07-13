package biblioteca;

public class Autor {

	private String nomeDoAutor;
	private int idadeDoAutor;

	
	public Autor(String nomeDoAutor, int idadeDoAutor) {
		this.nomeDoAutor = nomeDoAutor;
		this.idadeDoAutor = idadeDoAutor;
	
		Autor autor = new Autor("Paulo coelho", 45);
		}
}