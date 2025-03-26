import controllers.DigitIncreasingController;
import controllers.DigitPalindromicController;
import controllers.FarmController;
import controllers.MSenhController;
import controllers.PadovanController;
import java.util.Scanner;
import views.ConsoleView;

public class app {
    public static void main(String[] args) {
        ConsoleView view = new ConsoleView();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nElige una opción:");
            System.out.println("1. Resolver el problema de los patos y conejos");
            System.out.println("2. Verificar si un número es digit-increasing");
            System.out.println("3. Verificar si un número es digit-palindromic");
            System.out.println("4. Calcular el término n-ésimo de la serie de Padovan");
            System.out.println("5. Calcular el término n-ésimo de la serie mSenh");
            System.out.println("6. Salir");
            System.out.print("Opción: ");

            int opcion = scanner.nextInt();

            if (opcion == 1) {
                System.out.print("Ingrese el número de cabezas: ");
                int heads = scanner.nextInt();
                System.out.print("Ingrese el número de patas: ");
                int legs = scanner.nextInt();

                FarmController farmController = new FarmController(view);
                farmController.solveFarmProblem(heads, legs);

            } else if (opcion == 2) {
                System.out.print("Ingrese un número para verificar si es digit-increasing: ");
                int number = scanner.nextInt();

                DigitIncreasingController digitController = new DigitIncreasingController(view);
                digitController.checkDigitIncreasing(number);

            } else if (opcion == 3) {
                System.out.print("Ingrese un número para verificar si es digit-palindromic: ");
                int number = scanner.nextInt();

                DigitPalindromicController palindromicController = new DigitPalindromicController(view);
                palindromicController.checkDigitPalindromic(number);
            
            } else if (opcion == 4) {
                System.out.print("Ingrese el valor de n para la serie de Padovan: ");
                int n = scanner.nextInt();

                PadovanController padovanController = new PadovanController(view);
                padovanController.calculatePadovan(n);
            
            } else if (opcion == 5) {
                System.out.print("Ingrese el valor de n para la serie mSenh: ");
                int n = scanner.nextInt();

                MSenhController mSenhController = new MSenhController(view);
                mSenhController.calculateMSenh(n);

            } else if (opcion == 6) {
                System.out.println("Saliendo del programa...");
                break;

            } else {
                System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
        scanner.close();
    }
}
