// app.java
import controllers.CalculatorController;
import views.ConsoleView;

public class App {
    public static void main(String[] args) {
        ConsoleView view = new ConsoleView();
        CalculatorController controller = new CalculatorController(view);
        controller.start();
    }
}

