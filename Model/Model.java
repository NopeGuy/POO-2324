package Model;

import Exceptions.UtilizadorJaExisteException;

public class Model {

    private UtilizadorManager utilizadorManager;

    public Model() {
        this.utilizadorManager = new UtilizadorManager();
    }

    private boolean reverCredenciais(String email) {
        Utilizador u = this.utilizadorManager.encontraUserEmail(email);
        return u == null;
    }

    public void registarUtilizador(String nome, String email, String morada, int freqCard, int tipoUtilizador)
            throws NullPointerException, UtilizadorJaExisteException {

        if (reverCredenciais(email) != true) {
            throw new UtilizadorJaExisteException();
        }

        switch (tipoUtilizador) {
            case 0:
                UtilizadorOcasional u0 = new UtilizadorOcasional(nome, email, morada, freqCard, 0, 0);
                this.utilizadorManager.addUtilizador(u0);
                break;
            case 1:
                Utilizador u1 = new UtilizadorAmador(nome, email, morada, freqCard, 0, 0);
                this.utilizadorManager.addUtilizador(u1);
                break;
            case 2:
                Utilizador u2 = new UtilizadorProfissional(nome, email, morada, freqCard, 0, 0);
                this.utilizadorManager.addUtilizador(u2);
                break;
        
            default:
                break;
        }
    }

    public void listarUtilizadores() {
        this.utilizadorManager.listarUtilizadores();
    }
}
