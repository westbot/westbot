import java.util.List;

public abstract class Device implements OutputDevice {
    protected List<Shape> shapes;

    public Device(List<Shape> shapes) {
        this.shapes = shapes;
    }

    public abstract void outIt();
}
