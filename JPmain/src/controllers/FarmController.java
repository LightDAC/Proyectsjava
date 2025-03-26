package controllers;
import models.AnimalCounter;
import views.ConsoleView;

public class FarmController {
    private ConsoleView view;

    public FarmController(ConsoleView view) {
        this.view = view;
    }

    public void solveFarmProblem(int heads, int legs) {
        int[] result = AnimalCounter.countAnimals(heads, legs);
        if (result != null) {
            view.showResult(result[0], result[1]);
        } else {
            view.showError();
        }
    }
}

