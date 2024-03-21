package View;

import java.util.InputMismatchException;
import java.util.Scanner;

import Controller.Controller;
import Exceptions.UtilizadorJaExisteException;

public class Menu {

    private Controller _cont = null;
    Scanner scanner = null;

    public Menu(Controller c) {
        _cont = c;
        scanner = new Scanner(System.in);
    }

    public void start() throws UtilizadorJaExisteException {
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
                    menuUtilizadores();
                    break;
                case 2:
                    System.out.println("Atividades");
                    break;
                case 3:
                    System.out.println("Treino");
                    break;
                case 4:
                    System.out.println("Tempo");
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

    public void menuUtilizadores() throws UtilizadorJaExisteException {
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
                    adicionarUtilizador();
                    break;
                case 2:
                    System.out.println("Remover Utilizador");
                    break;
                case 3:
                    System.out.println("Listar Utilizadores");
                    _cont.listarUtilizadores();
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
            start();
        }
    }

    public void adicionarUtilizador() throws UtilizadorJaExisteException {
        System.out.println("Adicionar Utilizador");
        System.out.println("\nNome:");
        String nome = scanner.next();
        System.out.println("\nEmail:");
        String email = scanner.next();
        System.out.println("\nMorada:");
        String morada = scanner.next();
        int freqCard = 0;
        while (true) {
            try {
                System.out.println("\nFrequência Cardíaca Média:");
                freqCard = scanner.nextInt();
                if (freqCard < 50 || freqCard > 250) {
                    System.out.println("A frequência cardíaca deve estar entre 50 e 250. Tente novamente.");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, insira um número inteiro para a frequência cardíaca.");
                scanner.next();
            }
        }

        int tipoUtilizador = -1;
        while (tipoUtilizador < 0 || tipoUtilizador > 2) {
            try {
                System.out.println("\nTipo de Utilizador:");
                System.out.println("0 - Utilizador Ocasional");
                System.out.println("1 - Utilizador Amador");
                System.out.println("2 - Utilizador Profissional");
                tipoUtilizador = scanner.nextInt();
                if (tipoUtilizador < 0 || tipoUtilizador > 2) {
                    System.out.println("Opção inválida! Por favor, escolha uma opção entre 0 e 2.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor, insira um número inteiro para o tipo de utilizador.");
                scanner.next();
            }
        }

        try {
            _cont.registarUtilizador(nome, email, morada, freqCard, tipoUtilizador);
        } catch (NullPointerException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

}
