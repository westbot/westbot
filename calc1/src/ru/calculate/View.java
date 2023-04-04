
import java.util.Scanner;

public class View {
    private double lastValue;
    private final Scanner scanner;

    public View() {
        this.lastValue = 0.0;
        this.scanner = new Scanner(System.in);
    }

    public int showMenu() {
        System.out.println("Выберите опцию");
        System.out.println("1. Вывести последнее значение.");
        System.out.println("2. Ввести уравнение");
        System.out.println("0. Выход");
        return getOption();
    }

    public String getExpression() {
        String s = "";
        while (s.isEmpty()) {
            System.out.print("--> ");
            s = scanner.nextLine();
        }
        return s;
    }

    public void showLastValue() {
        System.out.print("Последнее вычисленное значение: ");
        System.out.printf("%.2f%n", lastValue);
    }

    private int getOption() {
        int opt = 5;
        while (true) {
            try {
                opt = Integer.parseInt(scanner.nextLine());
                if (opt != 1 && opt != 2 && opt != 0) throw new NumberFormatException();
                return opt;
            } catch (NumberFormatException ex) {
                System.out.println("Неверный ввод!");
            }
        }
    }

    public void showResult(String expression, double value){
        lastValue = value;
        System.out.printf("%s = %.2f\n------------------------------\n", expression, value);
    }

}
