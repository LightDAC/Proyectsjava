package views;

import java.util.Scanner;

public class ConsoleView {
    private Scanner scanner;

    public ConsoleView() {
        this.scanner = new Scanner(System.in);
    }

    public int getOperation() {
        System.out.println("Seleccione una operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("0. Salir");
        return scanner.nextInt();
    }

    public double getNumber(String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    public void showResult(double result) {
        System.out.println("Resultado: " + result);
    }

    public void showError(String message) {
        System.out.println("Error: " + message);
    }
}
