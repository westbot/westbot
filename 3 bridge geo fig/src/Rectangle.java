public class Rectangle implements Shape {
    private Point pTopLeft;
    private Point pBottomRight;

    public Rectangle(Point pTopLeft, Point pBottomRight) {
        this.pTopLeft = pTopLeft;
        this.pBottomRight = pBottomRight;
    }

    @Override
    public String drawIt() {
        return String.format("Rectangle: top left corner (%.1f; %.1f), bottom right corner (%.1f; %.1f)",
                pTopLeft.x, pTopLeft.y, pBottomRight.x, pBottomRight.y);
    }
}
