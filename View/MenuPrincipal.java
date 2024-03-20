package View;

import java.util.Scanner;

public class MenuPrincipal {
    public void start(){
        System.out.println("\n\n---------------------------");
        System.out.println("| Bem-vindo ao GymAtHome! |");
        System.out.println("---------------------------\n\n");
        System.out.println("1 - Utilizadores");
        System.out.println("2 - Atividades");
        System.out.println("3 - Treino");
        System.out.println("4 - Tempo\n");
        System.out.println("0 - Sair\n\n");

        try (Scanner scanner = new Scanner(System.in)) {
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    MenuUtilizadores menuUtilizadores = new MenuUtilizadores();
                    menuUtilizadores.start();
                    break;
                case 2:
                    MenuAtividades menuAtividades = new MenuAtividades();
                    menuAtividades.start();
                    break;
                case 3:
                    MenuTreino menuTreino = new MenuTreino();
                    menuTreino.start();
                    break;
                case 4:
                    MenuTempo menuTempo = new MenuTempo();
                    menuTempo.start();
                    break;
                case 0:
                    System.out.println("Adeus!");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
        
    }
}
