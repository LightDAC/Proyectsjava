package views;

public class ConsoleView {
    public void showResult(int ducks, int rabbits) {
        System.out.println("Número de patos: " + ducks);
        System.out.println("Número de conejos: " + rabbits);
    }

    public void showError() {
        System.out.println("No hay una solución válida para los datos ingresados.");
    }

    public void showDigitIncreasingResult(int n, int result) {
        if (result == 1) {
            System.out.println(n + " es un número digit-increasing.");
        } else {
            System.out.println(n + " no es un número digit-increasing.");
        }
    }

    public void showDigitPalindromicResult(int n, int result) {
        if (result == 1) {
            System.out.println(n + " es un número digit-palindromic.");
        } else {
            System.out.println(n + " no es un número digit-palindromic.");
        }
    }
    
    public void showMSenhResult(int n, int result) {
        System.out.println("El término " + n + " de la serie mSenh es: " + result);
    }
    
}

