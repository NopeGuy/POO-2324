package Exceptions;

public class UtilizadorJaExisteException extends Exception {

    public UtilizadorJaExisteException() {
        super("Utilizador já existe!");
    }
}