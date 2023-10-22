// Класс Пушка расширяющий класс Абстрактный Юнит
public class Cannon extends AbstractUnit {
    // конструктор просто вызывает конструктор предка
    public Cannon(String name, String color, String weapon, int attac, int protect) {
        super(name, color, weapon, attac, protect);
    }

    // Переопределённый абстрактный метод
    @Override
    public String getType() {
        return "Cannon";
    }
}
