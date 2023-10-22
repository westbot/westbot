// Класс Танк расширяющий класс Абстрактный Юнит
public class Tank extends AbstractUnit {
    // конструктор просто вызывает конструктор предка
    public Tank(String name, String color, String weapon, int attac, int protect) {
        super(name, color, weapon, attac, protect);
    }

    // Переопределённый абстрактный метод
    @Override
    public String getType() {
        return "Tank";
    }
}
