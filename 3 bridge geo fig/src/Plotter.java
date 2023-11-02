import java.util.List;

public class Plotter extends Device {
    public Plotter(List<Shape> shapes) {
        super(shapes);
    }

    @Override
    public void outIt() {
        System.out.println("Plotter started...");
        for (Shape s: shapes) {
            System.out.println("Plot shape:");
            System.out.println(s.drawIt());
        }
        System.out.println("Plotter done.\n");
    }
}
