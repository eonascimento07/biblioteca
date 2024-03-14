package biblioteca;

import java.util.Scanner;

public class Main extends Biblioteca{
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        
        biblioteca.adicionarLivro(new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", true));
        biblioteca.adicionarLivro(new Livro("Harry Potter", "J.K. Rowling", false));
        biblioteca.adicionarLivro(new Livro("Diário de um Banana", "Jeff Kinney", true));
        biblioteca.adicionarLivro(new Livro("Cabeça Fria, Coração Quente", "Abell Ferreira", true));
        
        Scanner scanner = new Scanner(System.in);
        
        int opcao;
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Emprestar livro");
            System.out.println("2. Devolver livro");
            System.out.println("3. Consultar livros disponíveis");
            System.out.println("4. Adicionar livros");
            System.out.println("5. Sair");
            System.out.println("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcao) {
            case 1:
            	
            	break;
            case 2:
            	//biblioteca.adicionarLivro(biblioteca.);
            case 3:
            	biblioteca.consultarLivrosDisponiveis();
            	break;
            
            case 4:
            	System.out.println("Digite o nome do livro que deseja adiconar");
                String addTitulo = scanner.nextLine();
            	System.out.println("Digite o nome do autor");
            	String addAutor = scanner.nextLine();
            	//biblioteca.adicionarLivro(addTitulo);
                System.out.println("Livro adicionado com sucesso!");
                break;
         }
            }
        }
    }
