

import controller.ControladorAjedrez;   
import models.TableroAjedrez;
import view.VistaAjedrez;

public class Main {
    public static void main(String[] args) {
        TableroAjedrez model = new TableroAjedrez();
        VistaAjedrez view = new VistaAjedrez();
        ControladorAjedrez controller = new ControladorAjedrez(model, view);

        controller.solve();
    }
}

