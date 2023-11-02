import java.util.List;

public class Monitor extends Device {
    public Monitor(List<Shape> shapes) {
        super(shapes);
    }

    @Override
    public void outIt() {
        System.out.println("Monitor working...");
        for (Shape s : shapes) {
            System.out.println("Draw shape:");
            System.out.println(s.drawIt());
        }
        System.out.println("Monitor still working.\n");
    }
}
