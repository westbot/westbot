public class Triangle implements Shape {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String drawIt() {
        return String.format("Triangle with corner points A(%.1f; %.1f), B(%.1f; %.1f), C(%.1f; %.1f)",
                a.x, a.y, b.x, b.y, c.x, c.y);
    }
}
