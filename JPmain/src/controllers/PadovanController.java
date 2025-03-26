package controllers;

import models.Padovan;
import views.ConsoleView;

public class PadovanController {
    private ConsoleView view;

    public PadovanController(ConsoleView view) {
        this.view = view;
    }

    public void calculatePadovan(int n) {
        int result = Padovan.getPadovan(n);
        view.showMSenhResult(n, result);
    } 
}
