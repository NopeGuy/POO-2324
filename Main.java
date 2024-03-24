import Controller.Controller;
import Exceptions.UtilizadorJaExisteException;
import Exceptions.UtilizadorNaoExisteException;
import Model.Model;
import View.*;

public class Main {
    public static void main(String[] args) throws UtilizadorJaExisteException, UtilizadorNaoExisteException {
        Model m = new Model();
        Controller c = new Controller(m);

        try {
            c.load();
        } catch (Exception e) {
            System.out.println("No Save state!");
        }

        View view = new View(c);
        view.start();
    }
}