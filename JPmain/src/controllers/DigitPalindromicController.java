package controllers;

import models.DigitPalindromic;
import views.ConsoleView;

public class DigitPalindromicController {
    private ConsoleView view;

    public DigitPalindromicController(ConsoleView view) {
        this.view = view;
    }

    public void checkDigitPalindromic(int n) {
        int result = DigitPalindromic.isDigitPalindromic(n);
        view.showDigitPalindromicResult(n, result);
    }
}
