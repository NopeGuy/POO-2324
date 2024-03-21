package Model;

import java.util.HashMap;
import java.util.Map;

public class UtilizadorManager {
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

    public void listarUtilizadores() {
        if (userMap.isEmpty()) {
            System.out.println("Não existem utilizadores registados.");
            return;
        }
        for (Integer user_id : userMap.keySet()) {
            System.out.println(userMap.get(user_id).toString());
        }
    }
}
