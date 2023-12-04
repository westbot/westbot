import java.awt.Point;
import java.awt.Color;
import java.lang.Cloneable;

public abstract class Shape implements Cloneable {
    private String name;
    private Color color;

    public Shape(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    public Shape(Shape another) {
        this.name = another.name;
        this.color = another.color;
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ", Color: " + getColor().toString();
    }

    public abstract Shape clone();
    public abstract void move(Point delta);
    public abstract void resize(Point delta);
}
