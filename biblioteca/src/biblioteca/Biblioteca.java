package biblioteca;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;
    

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void emprestarLivro(String titulo) {
    	boolean encontrado = false;
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo)) {
                encontrado = true;
                if (livro.isDisponibilidade()) {
                    livro.setDisponibilidade(false);
                    System.out.println("Livro emprestado: " + livro.getTitulo() +", autor: "+ livro.getAutor());
                } else{
                    System.out.println("Livro já está emprestado.");
                }
            }
        }
        if (!encontrado) {
            System.out.println("Livro não encontrado.");
        }
    }

    public void devolverLivro(String titulo) {
    	boolean encontrado1 = false;
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo)) {
                encontrado1 = true;
                if (!livro.isDisponibilidade()) {
                    livro.setDisponibilidade(true);
                    System.out.println("Livro devolvido: " + livro.getTitulo() + "autor: " + livro.getAutor());
                } else {
                    System.out.println("Livro não disponivel para devolução.");
                }
            }
        }
        if (!encontrado1) {
            System.out.println("Livro não encontrado.");
        }
    }
    public void consultarLivrosDisponiveis() {
        System.out.println("Todos os livros na biblioteca:");
        for (Livro livro : livros) {
            System.out.println("título: " + livro.getTitulo() + " - autor: " + livro.getAutor() + " - " + (livro.isDisponibilidade() ? "Disponível" : "Indisponível"));
        }
    }


	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	} 
}
