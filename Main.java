import Controller.Controller;
import Exceptions.UtilizadorJaExisteException;
import Model.Model;
import View.*;

public class Main {
    public static void main(String[] args) throws UtilizadorJaExisteException {
        Model m = new Model();
        Controller c = new Controller(m);

        // Depois incrementar counter do ID de utilizador quando se ler de ficheiro 
        // com setter de nUtilizadorCounter no menu principal chamando o model

        View view = new View(c);
        view.start();
    }
}