package controllers;

import models.MSenh;
import views.ConsoleView;

public class MSenhController {
    private ConsoleView view;

    public MSenhController(ConsoleView view) {
        this.view = view;
    }

    public void calculateMSenh(int n) {
        int result = MSenh.mSenh(n);
        view.showMSenhResult(n, result);
    }
}

