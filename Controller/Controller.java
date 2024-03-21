package Controller;

import Exceptions.UtilizadorJaExisteException;
import Model.Model;

public class Controller {
    private Model m;

    public Controller(Model m) {
        this.m = m;
    }

    public void registarUtilizador(String nome, String email, String morada, int freqCard, int escolha)
            throws NullPointerException, UtilizadorJaExisteException {

        this.m.registarUtilizador(nome, email, morada, freqCard, escolha);
    }

    public void listarUtilizadores() {
        this.m.listarUtilizadores();
    }

}
