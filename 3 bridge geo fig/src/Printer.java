import java.util.List;

public class Printer extends Device {
    public Printer(List<Shape> shapes){
        super(shapes);
    }

    @Override
    public void outIt() {
        System.out.println("Printer started...");
        for (Shape s : shapes) {
            System.out.println("Print shape:");
            System.out.println(s.drawIt());
        }
        System.out.println("Print done.\n");
    }
}
