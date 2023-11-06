import java.util.List;
import java.util.ArrayList;

public class Action implements Subject, Observer {
    private String name;
    private double price;
    private double volatility;
    private List<Observer> investors;
    private String message = "";

    public Action(String name, double price, double volatility) {
        this.name = name;
        this.price = price;
        this.volatility = volatility;
        this.investors = new ArrayList<>();
    }

    private void updatePrice() {
        double percents = 2.0 * volatility * Math.random() - volatility;
        price += price / 100.0 * percents;
    }

    @Override
    public void subscribe(Observer observer) {
        investors.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        investors.remove(observer);
    }

    @Override
    public void update() {
        for (Observer o : investors)
            o.update(message);
    }

    @Override
    public void update(String msg) {
        updatePrice();
        message = msg + ", action " + name + ", price: " + String.format("%.3f", price);
        update();
    }
}
