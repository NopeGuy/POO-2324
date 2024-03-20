package View;

import java.util.Scanner;
import Model.*;

public class MenuUtilizadores {
    
    private MenuPrincipal menuPrincipal = new MenuPrincipal();

    public void start() {
        System.out.println("Menu Utilizadores");
        System.out.println("1 - Adicionar Utilizador");
        System.out.println("2 - Remover Utilizador");
        System.out.println("3 - Listar Utilizadores");
        System.out.println("4 - Atualizar Utilizador");
        System.out.println("0 - Voltar\n");

        try (Scanner scanner = new Scanner(System.in)) {
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Adicionar Utilizador");
                    System.out.println("Nome:");
                    String nome = scanner.next();
                    System.out.println("Email:");
                    String email = scanner.next();
                    System.out.println("Morada:");
                    String morada = scanner.next();
                    System.out.println("Frequência Cardíaca Média:");
                    int freqCard = scanner.nextInt();
                    Model.registarUtilizadorAmador(nome,email,morada,freqCard);
                    break;
                case 2:
                    System.out.println("Remover Utilizador");
                    break;
                case 3:
                    System.out.println("Listar Utilizadores");
                    break;
                case 4:
                    System.out.println("Atualizar Utilizador");
                    break;
                case 0:
                    System.out.println("Voltar");
                    break;
                default:
                    System.out.println("\nOpção inválida!\n");
                    start();
                    break;
            }
            menuPrincipal.start();
        }
    }
}
