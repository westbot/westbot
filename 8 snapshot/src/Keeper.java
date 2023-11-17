import java.util.Stack;

public class Keeper {
    private Stack<Integer> history;

    public Keeper() {
        history = new Stack<>();
    }

    public void keep(int value) {
        history.push(value);
    }

    public boolean canRestore() {
        return !history.isEmpty();
    }

    public int restore() {
        return history.pop();
    }
}
