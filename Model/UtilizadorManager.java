package Model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import Exceptions.UtilizadorNaoExisteException;

public class UtilizadorManager implements Serializable {
    private Map<Integer, Utilizador> userMap = new HashMap<>();

    public Utilizador encontraUserEmail(String email) {
        for (Integer user_id : userMap.keySet()) {
            Utilizador temp = this.userMap.get(user_id);
            if (temp.getEmail().equals(email))
                return temp;
        }
        return null;
    }

    public void addUtilizador(Utilizador utilizador) throws NullPointerException {
        if (utilizador == null) {
            throw new NullPointerException("Utilizador is null");
        }
        this.userMap.put(utilizador.getNUtilizador(), utilizador.clone());
    }

    public void removeUtilizador(int nUtilizador) {
        this.userMap.remove(nUtilizador);
    }

    public void listarUtilizadores() {
        if (userMap.isEmpty()) {
            System.out.println("Não existem utilizadores registados.");
            return;
        }
        for (Integer user_id : userMap.keySet()) {
            System.out.println(userMap.get(user_id).toString());
        }
    }

    public void atualizarNome(int nUtilizador, String nome) {
        Utilizador temp = this.userMap.get(nUtilizador);
        temp.setNome(nome);
    }

    public void atualizarEmail(int nUtilizador, String email) {
        Utilizador temp = this.userMap.get(nUtilizador);
        temp.setEmail(email);
    }

    public void atualizarMorada(int nUtilizador, String morada) {
        Utilizador temp = this.userMap.get(nUtilizador);
        temp.setMorada(morada);
    }

    public void atualizarFreqCard(int nUtilizador, int freqCardiaca) {
        Utilizador temp = this.userMap.get(nUtilizador);
        temp.setFreqCard(freqCardiaca);
    }

    public void atualizarUser(int nUtilizador, int val){
        switch(val){
            case 0:
                Utilizador u = this.userMap.get(nUtilizador);
                UtilizadorOcasional uo = new UtilizadorOcasional(u.getNUtilizador(), u.getNome(), u.getMorada(),u.getEmail(), u.getFreqCard());
                this.userMap.put(nUtilizador, uo.clone());
                break;
            case 1:
                Utilizador u1 = this.userMap.get(nUtilizador);
                UtilizadorAmador ua = new UtilizadorAmador(u1.getNUtilizador(), u1.getNome(), u1.getMorada(),u1.getEmail(), u1.getFreqCard());
                this.userMap.put(nUtilizador, ua.clone());
                break;
            case 2:
                Utilizador u2 = this.userMap.get(nUtilizador);
                UtilizadorProfissional up = new UtilizadorProfissional(u2.getNUtilizador(), u2.getNome(), u2.getMorada(),u2.getEmail(), u2.getFreqCard());
                this.userMap.put(nUtilizador, up.clone());
                break;
        }
    }

    public void pesquisarUtilizador(int nUtilizador) throws UtilizadorNaoExisteException {
        if (this.userMap.containsKey(nUtilizador)) {
            System.out.println(this.userMap.get(nUtilizador).toString());
        } else {
            throw new UtilizadorNaoExisteException();
        }
    }


}
