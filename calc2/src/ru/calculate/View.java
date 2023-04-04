

import java.util.List;
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
        System.out.println("2. Ввести уравнение.");
        System.out.println("3. Сохранить историю в файл.");
        System.out.println("4. Выбрать уравнение из файла.");
        System.out.println("0. Выход.");
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

    public String getFilename() {
        System.out.println("Введите имя файла (Enter - по умолчанию)");
        return scanner.nextLine() + ".txt";
    }

    public String fromList(List<String> list) {
        int answer = list.size() + 1;
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%d). %s\n", i, list.get(i));
        }
        while (answer >= list.size()) {
            try {
                System.out.print("--> ");
                answer = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("Некорректный ввод!");
            }
        }
        return list.get(answer);
    }

    public void showLastValue() {
        System.out.print("Последнее вычисленное значение: ");
        System.out.printf("%.2f%n", lastValue);
    }

    private int getOption() {
        int opt;
        while (true) {
            try {
                opt = Integer.parseInt(scanner.nextLine());
                if (opt < 0 || opt > 4) throw new NumberFormatException();
                return opt;
            } catch (NumberFormatException ex) {
                System.out.println("Неверный ввод!");
            }
        }
    }

    public void showResult(String expression, double value) {
        lastValue = value;
        System.out.printf("%s = %.2f\n------------------------------\n", expression, value);
    }

}
