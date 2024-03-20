package Model;

public class Model {

    public static void registarUtilizadorAmador(String nome, String email, String morada, int freqCard) {
        
        Utilizador utilizador = new UtilizadorAmador(nome, email, morada, freqCard, 0, 0);
        System.out.println(utilizador.toString());
        
    }
    


}
