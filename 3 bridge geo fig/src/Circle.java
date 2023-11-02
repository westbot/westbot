public class Circle implements Shape {
    private Point centre;
    private double radius;

    public Circle(Point centre, double radius) {
        this.centre = centre;
        this.radius = radius;
    }

    @Override
    public String  drawIt() {
        return String.format("Circle at (%.1f; %.1f) radius os %.1f", centre.x, centre.y, radius);
    }
}
