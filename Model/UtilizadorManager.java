package Model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

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

}
