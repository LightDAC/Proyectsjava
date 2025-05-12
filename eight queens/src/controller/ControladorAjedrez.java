package controller;

import models.TableroAjedrez;
import view.VistaAjedrez;

public class ControladorAjedrez {
    private TableroAjedrez model;
    private VistaAjedrez view;

    public ControladorAjedrez(TableroAjedrez model, VistaAjedrez view) {
        this.model = model;
        this.view = view;
    }

    public ControladorAjedrez() {
    }

    public void solve() {
        if (model.placeQueens(0)) {
            view.showMessage("Solución encontrada:");
            view.displayBoard(model.getQueens(), model.getSize());
        } else {
            view.showMessage("No se encontró solución.");
        }
    }
}


