import java.awt.Point;
import java.awt.Color;

public class Rectangle extends Shape {
    private Point top_left;
    private Point bottom_right;

    public Rectangle(Point top_left, Point bottom_right, Color color) {
        super("Rectangle", color);
        this.top_left = top_left;
        this.bottom_right = bottom_right;
    }

    public Rectangle(Rectangle another) {
        super(another.getName(), another.getColor());
        this.top_left = another.top_left;
        this.bottom_right = another.bottom_right;
    }

    @Override
    public void move(Point delta) {
        this.top_left.x += delta.getX();
        this.top_left.y += delta.getY();
        this.bottom_right.x += delta.getX();
        this.bottom_right.y += delta.getY();
    }

    @Override
    public void resize(Point delta) {
        this.bottom_right.x += delta.getX();
        this.bottom_right.y += delta.getY();
    }

    @Override
    public String toString() {
        return super.toString() + ", Top-Left(" + top_left.x + "; " + top_left.y + "), Bottom-Right(" + bottom_right.x
                + "; " + bottom_right.y + ")";
    }

    @Override
    public Rectangle clone() {
        return new Rectangle(this);
    }
}
