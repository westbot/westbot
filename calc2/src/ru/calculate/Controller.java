

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Controller {
    public static final Logger logger = Logger.getLogger("Logger");

    static {
        FileHandler fh;
        try {
            fh = new FileHandler("C:/MyLog.log");
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);
            logger.setUseParentHandlers(false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private View view;
    private Model model;
    private String expression;
    private List<String> expressions;

    public Controller() {
        this.view = new View();
        this.model = new Model();
        this.expressions = new ArrayList<>();
    }

    public void go() {
        while (true) {
            switch (view.showMenu()) {
                case 1:
                    view.showLastValue();
                    logger.info("Выведено последнее значение.");
                    break;
                case 2:
                    expression = view.getExpression();
                    view.showResult(expression, calculate());
                    logger.info("Посчитан и вывведен результат.");
                    break;
                case 3:
                    saveToFile();
                    break;
                case 4:
                    readFromFile();
                    break;
                case 0:
                    System.out.println("До свидания!");
                    logger.info("Выход из программы.");
                    System.exit(0);
            }
        }
    }

    public void readFromFile() {
        List<String> lines = new ArrayList<>();
        String filename = view.getFilename();
        try (Scanner fscan = new Scanner(new File(filename))) {
            while (fscan.hasNextLine()) {
                lines.add(fscan.nextLine());
            }
            logger.info(String.format("Прочитан файл с выражениями (%s)", filename));
            expression = view.fromList(lines);
            view.showResult(expression, calculate());
        } catch (IOException ex) {
            System.out.println("Файл не найден!");
            logger.warning("Не найден файл с выражениями.");
        }
    }

    public void saveToFile() {
        String filename = view.getFilename();
        if (filename.isEmpty()) {
            filename = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH-mm")) + ".txt";
        }
        try (FileWriter writer = new FileWriter(filename)) {
            for (String s : expressions) {
                writer.write(s);
                writer.write("\n");
            }
            writer.flush();
            logger.info(String.format("Создан и записан файл с выражениями (%s)", filename));
        } catch (IOException ex) {
            ex.printStackTrace();
            logger.warning("Не удалось создать и записать файл с выражениями");
        }
    }

    public double calculate() {
        expressions.add(expression);
        logger.info("Получено выражение " + expression);
        double temp;
        expression = expression.replaceAll("\\|-?(\\d+)\\|", "$1");
        String[] items = expression.split("(?<=[0-9,.])(?=[-+*/%^]+)|(?<=[-+*/%^])(?=[0-9,.])");

        while (model.contains(items, "//")) {
            for (int i = 1; i < items.length - 1; i += 2) {
                if (items[i].equals("//")) {
                    temp = model.divmod(Double.parseDouble(items[i - 1]), Double.parseDouble(items[i + 1]));
                    items[i - 1] = String.valueOf(temp);
                    items = model.remove(items, i);
                    break;
                }
            }
        }
        while (model.contains(items, "/")) {
            for (int i = 1; i < items.length - 1; i += 2) {
                if (items[i].equals("/")) {
                    temp = model.div(Double.parseDouble(items[i - 1]), Double.parseDouble(items[i + 1]));
                    items[i - 1] = String.valueOf(temp);
                    items = model.remove(items, i);
                    break;
                }
            }
        }
        while (model.contains(items, "%")) {
            for (int i = 1; i < items.length - 1; i += 2) {
                if (items[i].equals("%")) {
                    temp = model.mod(Double.parseDouble(items[i - 1]), Double.parseDouble(items[i + 1]));
                    items[i - 1] = String.valueOf(temp);
                    items = model.remove(items, i);
                    break;
                }
            }
        }
        while (model.contains(items, "**") || model.contains(items, "^")) {
            for (int i = 1; i < items.length - 1; i += 2) {
                if (items[i].equals("**") || items[i].equals("^")) {
                    temp = model.pow(Double.parseDouble(items[i - 1]), Double.parseDouble(items[i + 1]));
                    items[i - 1] = String.valueOf(temp);
                    items = model.remove(items, i);
                    break;
                }
            }
        }
        while (model.contains(items, "*")) {
            for (int i = 1; i < items.length - 1; i += 2) {
                if (items[i].equals("*")) {
                    temp = model.mul(Double.parseDouble(items[i - 1]), Double.parseDouble(items[i + 1]));
                    items[i - 1] = String.valueOf(temp);
                    items = model.remove(items, i);
                    break;
                }
            }
        }

        double res = Double.parseDouble(items[0]);
        for (int i = 1; i < items.length - 1; i += 2) {
            if (items[i].equals("+")) {
                res = model.sum(res, Double.parseDouble(items[i + 1]));
            } else {
                res = model.diff(res, Double.parseDouble(items[i + 1]));
            }
        }
        logger.info(String.format("Вычислен результат: %.3f", res));
        return res;
    }
}
