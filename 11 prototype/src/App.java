import java.awt.Point;
import java.awt.Color;

public class App {
    public static void main(String[] args) {
        Toolchain toolchain = new Toolchain();
        toolchain.addShape(new Circle(new Point(40, 40), 25, Color.RED));
        toolchain.addShape(new Rectangle(new Point(5, 5), new Point(95, 95), Color.BLUE));

        try {
            System.out.println("Рисуем круг...");
            Shape circle = toolchain.getByName("Circle");
            System.out.println(circle.toString());
            System.out.println("Теперь изменим и подвинем...");
            circle.move(new Point(15, 15));
            circle.resize(new Point(10, 0));
            System.out.println(circle.toString());
            System.out.println("И нарисуем ещё один...");
            Shape another = toolchain.getByName("Circle");
            System.out.println(another.toString());
        }
        catch (ToolNotFoundException e) {
            System.out.println("Что-то с кругом не задалось.");
        }

        try {
            System.out.println("Рисуем прямоугольник...");
            Shape rectangle = toolchain.getByName("Rectangle");
            System.out.println(rectangle.toString());
            System.out.println("Теперь изменим и подвинем...");
            rectangle.move(new Point(15, 15));
            rectangle.resize(new Point(10, 0));
            System.out.println(rectangle.toString());
            System.out.println("И нарисуем ещё один...");
            Shape another = toolchain.getByName("Rectangle");
            System.out.println(another.toString());
        }
        catch (ToolNotFoundException e) {
            System.out.println("Что-то с прямоугольником не задалось.");
        }

        try {
            System.out.println("Рисуем треугольник...");
            Shape triangle = toolchain.getByName("Triangle");
            System.out.println(triangle.toString());
            System.out.println("Теперь изменим и подвинем...");
            triangle.move(new Point(15, 15));
            triangle.resize(new Point(10, 0));
            System.out.println(triangle.toString());
            System.out.println("И нарисуем ещё один...");
            Shape another = toolchain.getByName("triangle");
            System.out.println(another.toString());
        }
        catch (ToolNotFoundException e) {
            System.out.println("Что-то с прямоугольником не задалось.");
        }
    }
}
