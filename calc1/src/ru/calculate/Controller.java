
public class Controller {
    private View view;
    private Model model;
    private String expression;

    public Controller() {
        this.view = new View();
        this.model = new Model();
    }

    public void go() {
        while (true) {
            switch (view.showMenu()) {
                case 1:
                    view.showLastValue();
                    break;
                case 2:
                    expression = view.getExpression();
                    view.showResult(expression, calculate());
                    break;
                case 0:
                    System.out.println("До свидания!");
                    System.exit(0);
            }
        }
    }

    public double calculate() {
        double temp;
        String[] items = expression.split("(?<=[0-9,.])(?=[-+*/])|(?<=[-+*/])(?=[0-9,.])");
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
        double res = Double.parseDouble(items[0]);
        for (int i = 1; i < items.length-1; i+=2) {
            if (items[i].equals("+")){
                res = model.sum(res, Double.parseDouble(items[i+1]));
            } else {
                res = model.diff(res, Double.parseDouble(items[i+1]));
            }
        }
        return res;
    }
}
