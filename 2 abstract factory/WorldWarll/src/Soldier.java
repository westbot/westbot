// Класс Солдат расширяющий класс Абстрактный Юнит
public class Soldier extends AbstractUnit {
    // конструктор просто вызывает конструктор предка
    public Soldier(String name, String color, String weapon, int attac, int protect) {
        super(name, color, weapon, attac, protect);
    }

    // Переопределённый абстрактный метод
    @Override
    public String getType() {
       return "Soldier";
   }
}
