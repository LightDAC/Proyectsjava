package controllers;

import models.DigitIncreasing;
import views.ConsoleView;

public class DigitIncreasingController {
    private ConsoleView view;

    public DigitIncreasingController(ConsoleView view) {
        this.view = view;
    }

    public void checkDigitIncreasing(int n) {
        int result = DigitIncreasing.isDigitIncreasing(n);
        view.showDigitIncreasingResult(n, result);
    }
}
