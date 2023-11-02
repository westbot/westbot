import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[] {
                new Circle(new Point(40, 40), 25),
                new Triangle(new Point(10.5, 4.4), new Point(20, 20), new Point(7.5, 5.7)),
                new Rectangle(new Point(2.2, 2.2), new Point(50, 70))
        };

        OutputDevice[] devs = new OutputDevice[] {
               new Plotter(Arrays.asList(shapes)),
               new Printer(Arrays.asList(shapes)),
               new Monitor(Arrays.asList(shapes))
        };

        for ( OutputDevice d : devs)
            d.outIt();
    }
}
