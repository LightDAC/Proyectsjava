package controllers;

import models.Calculator;
import views.ConsoleView;

public class CalculatorController {
    private ConsoleView view;

    public CalculatorController(ConsoleView view) {
        this.view = view;
    }

    public void start() {
        while (true) {
            int operation = view.getOperation();
            if (operation == 0) {
                System.out.println("Saliendo de la calculadora...");
                break;
            }

            double num1 = view.getNumber("Ingrese el primer número: ");
            double num2 = view.getNumber("Ingrese el segundo número: ");

            try {
                double result = 0;
                switch (operation) {
                    case 1: result = Calculator.add(num1, num2); break;
                    case 2: result = Calculator.subtract(num1, num2); break;
                    case 3: result = Calculator.multiply(num1, num2); break;
                    case 4: result = Calculator.divide(num1, num2); break;
                    default: view.showError("Opción inválida."); continue;
                }
                view.showResult(result);
            } catch (ArithmeticException e) {
                view.showError(e.getMessage());
            }
        }
    }
}
