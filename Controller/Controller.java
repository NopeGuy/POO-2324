package Controller;

import Exceptions.UtilizadorJaExisteException;
import Exceptions.UtilizadorNaoExisteException;
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

    public void removerUtilizador(int nUtilizador) {
        this.m.removerUtilizador(nUtilizador);
    }

    public void atualizarUtilizador(int nUtilizador, int opcao , String value) {
        this.m.atualizarUtilizador(nUtilizador, opcao, value);
    }

    public void listarUtilizadores() {
        this.m.listarUtilizadores();
    }

    public void load() throws Exception, ClassNotFoundException {
        this.m = Model.load("data.ser");
    }

    public void save() throws Exception {
        this.m.save("data.ser");
    }

    public void pesquisarUtilizador(int nUtilizador) throws UtilizadorNaoExisteException {
        this.m.pesquisarUtilizador(nUtilizador);
    }
}
