import Controller.Controller;
import Exceptions.UtilizadorJaExisteException;
import Model.Model;
import View.*;

public class Main {
    public static void main(String[] args) throws UtilizadorJaExisteException {
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