import java.awt.Point;
import java.awt.Color;

public class Circle extends Shape {
    private Point centre;
    private int radius;

    public Circle(Point centre, int radius, Color color) {
        super("Circle", color);
        this.centre = centre;
        this.radius = radius;
    }

    public Circle(Circle another) {
        super(another.getName(), another.getColor());
        this.centre = another.centre;
        this.radius = another.radius;
    }

    @Override
    public void move(Point delta) {
        centre.x += delta.getX();
        centre.y += delta.getY();
    }

    @Override
    public void resize(Point delta) {
        this.radius += delta.getX();
    }

    @Override
    public String toString() {
        return super.toString() + ", Centre(" + centre.getX() + "; " + centre.getY() + "),  Radius: " + radius;
    }

    @Override
    public Circle clone() {
        return new Circle(this);
    }
}
