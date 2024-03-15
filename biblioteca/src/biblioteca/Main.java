package biblioteca;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {
    	boolean sair = false;
        Biblioteca biblioteca = new Biblioteca();
        
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
                    System.out.println("Digite o nome do livro que deseja emprestar ");
                    String emprestar = scanner.nextLine();
                    biblioteca.emprestarLivro(emprestar);
                    break;
                case 2:
                    System.out.println("Digite o nome do livro que deseja devolver");
                    String devolver = scanner.nextLine();
                    biblioteca.emprestarLivro(devolver);
                    break;
                case 3:
                    biblioteca.consultarLivrosDisponiveis();
                    break;
                case 4:
                    System.out.println("Digite o nome do livro que deseja adicionar:");
                    String addTitulo = scanner.nextLine();
                    System.out.println("Digite o nome do autor:");
                    String addAutor = scanner.nextLine();
               
                    boolean disponibilidade = true;
                    biblioteca.adicionarLivro(new Livro(addTitulo, addAutor, disponibilidade));
                    System.out.println("Livro adicionado com sucesso!");
                    break;
                case 5:
                	sair = true;
                	break;
                	
               default: System.out.println("Opção inválida"); 
               Thread.sleep(1500);
                
            }
        } while (!sair);
        System.out.println("Programa encerrado.");
        Thread.sleep(2000);
        clearScreen();
    }
    
    public static void clearScreen() throws InterruptedException {
    	for(int i = 0; i < 25; i++) 
            System.out.println("");
    	

    	
    }
}