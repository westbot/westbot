public class Investor implements Observer {
    private String name;

    public Investor(String name) {
        this.name = name;
    }

    @Override
    public void update(String msg) {
        System.out.println("Investor " + name + " got message:");
        System.out.println(msg);
    }
}
