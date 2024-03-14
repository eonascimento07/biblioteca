package biblioteca;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
    	System.out.println("Informe o nome e o autor do livro");
        livros.add(livro);
    }

    public void emprestarLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo) && livro.isDisponibilidade()) {
                livro.setDisponibilidade(false);
                System.out.println("Livro emprestado: " + livro.getTitulo());
                return;
            }
        }
        System.out.println("Livro não disponível para empréstimo ou não encontrado.");
    }

    public void devolverLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo) && !livro.isDisponibilidade()) {
                livro.setDisponibilidade(true);
                System.out.println("Livro devolvido: " + livro.getTitulo());
                return;
            }
        }
        System.out.println("Livro não encontrado ou já está disponível.");
    }

    public void consultarLivrosDisponiveis() {
        System.out.println("Livros disponíveis na biblioteca:");
        for (Livro livro : livros) {
            if (livro.isDisponibilidade()) {
                System.out.println("- " + livro.getTitulo());
            }
        }
    }

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}
    
    
}
