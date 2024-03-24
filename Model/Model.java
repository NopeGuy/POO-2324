package Model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import Exceptions.UtilizadorJaExisteException;
import Exceptions.UtilizadorNaoExisteException;

public class Model implements Serializable {

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

        if (reverCredenciais(email) != true) 
            throw new UtilizadorJaExisteException();
        

        switch (tipoUtilizador) {
            case 0:
                UtilizadorOcasional u0 = new UtilizadorOcasional(nome, email, morada, freqCard);
                this.utilizadorManager.addUtilizador(u0);
                break;
            case 1:
                Utilizador u1 = new UtilizadorAmador(nome, email, morada, freqCard);
                this.utilizadorManager.addUtilizador(u1);
                break;
            case 2:
                Utilizador u2 = new UtilizadorProfissional(nome, email, morada, freqCard);
                this.utilizadorManager.addUtilizador(u2);
                break;

            default:
                break;
        }
    }

    public void listarUtilizadores() {
        this.utilizadorManager.listarUtilizadores();
    }

    public void removerUtilizador(int nUtilizador) {
        this.utilizadorManager.removeUtilizador(nUtilizador);
    }

    public void atualizarUtilizador(int nUtilizador, int opcao, String value) {
        switch (opcao) {
            case 1:
                this.utilizadorManager.atualizarNome(nUtilizador, value);
                break;
            case 2:
                this.utilizadorManager.atualizarEmail(nUtilizador, value);
                break;
            case 3:
                this.utilizadorManager.atualizarMorada(nUtilizador, value);
                break;
            case 4:
                this.utilizadorManager.atualizarFreqCard(nUtilizador, Integer.parseInt(value));
                break;
            case 5:
                this.utilizadorManager.atualizarUser(nUtilizador, Integer.parseInt(value));
        }
    }

    // Load method
    public static Model load(String fileName) throws IOException, ClassNotFoundException {
        String filePath = "data/" + fileName; 
        try (FileInputStream fs = new FileInputStream(filePath);
                ObjectInputStream os = new ObjectInputStream(fs)) {
            return (Model) os.readObject();
        }
    }

    // Save method
    public void save(String fileName) throws IOException {
        String filePath = "data/" + fileName;
        try (FileOutputStream fs = new FileOutputStream(filePath);
                ObjectOutputStream os = new ObjectOutputStream(fs)) {
            os.writeObject(this);
        }
    }

    public void pesquisarUtilizador(int nUser) throws UtilizadorNaoExisteException{
        this.utilizadorManager.pesquisarUtilizador(nUser);
    }
}
