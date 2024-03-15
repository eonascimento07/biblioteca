package biblioteca;
import java.util.Scanner;
public class Livro {

	String titulo;
	String autor;
	int estoque;
	boolean disponibilidade;
	
	public Livro(String titulo, String autor, boolean disponibilidade) {
		this.titulo = titulo;
		this.autor = autor;
		this.disponibilidade = disponibilidade;		
}
	public void vDisponibilidade() {
		if (disponibilidade == true) {
			System.out.println("O livro: " + titulo + " está dispoível, deseja empresta-lo? Responda com S/N.");
			Scanner scanner = new Scanner(System.in);
	        String resposta = scanner.nextLine();
	        if (resposta.equalsIgnoreCase("S")) {
					System.out.println("O livro " + titulo +" foi emprestado");
				} else {
					System.out.println("o livro não foi emprestado, encerrando programa.");
				}
					
	} else {
		System.out.println("O livro: "+titulo+" não está disponível.");
		}
	}

	//getterns and setters
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public boolean isDisponibilidade() {
		return disponibilidade;
	}
	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}

	
}