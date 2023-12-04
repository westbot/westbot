import java.util.Map;
import java.util.HashMap;

public class Toolchain {
    private Map<String, Shape> shapes;

    public Toolchain() {
        shapes = new HashMap<>();
    }

    public void addShape(Shape shape) {
        shapes.put(shape.getName(), shape);
    }

    public Shape getByName(String name) throws ToolNotFoundException {
        if ( !shapes.containsKey(name) )
            throw new ToolNotFoundException();
        return shapes.get(name).clone();
    }
}
