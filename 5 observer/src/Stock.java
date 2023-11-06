import java.util.List;
import java.util.ArrayList;

public class Stock implements Subject {
    private String name;
    private List<Observer> actions;
    private int sessionId;

    public Stock(String name) {
        this.name = name;
        this.sessionId = 0;
        this.actions = new ArrayList<>();
    }

    @Override
    public void subscribe(Observer observer) {
        actions.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        actions.remove(observer);
    }

    @Override
    public void update() {
        String msg = "Stock " + name + ", session #" + sessionId;

        for ( Observer o : actions )
            o.update(msg);
    }

    public void nextSession() {
        sessionId += 1;
        update();
    }
}
