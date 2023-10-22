import java.util.List;
import java.util.LinkedList;
import java.lang.StringBuilder;


// Класс Армия
public class Army {
    private String title;
    // поле-ссылка на фабрику для создания юнитов
    private ArmyFactory factory;
    // список юнитов
    private List<Unit> units;

    // конструктор принимает строку - название армии и ссылку на фабрику
    public Army(String title, ArmyFactory factory) {
        this.title = title;
        this.factory = factory;
        this.units = new LinkedList<Unit>();
    }

    // 3 метода для добавления юнитов
    public void addSoldier() {
        units.add(factory.createSoldier());
    }

    public void addTank() {
        units.add(factory.createTank());
    }

    public void addCannon() {
        units.add(factory.createCannon());
    }

    // метод, возвращающий информацию обо всех юнитах
    public String getSummary() {
        StringBuilder sb = new StringBuilder();
        sb.append(title + ":\n");
        for (Unit u : units) {
            sb.append("Unit type: " + u.getType() +"\n");
            sb.append("Name: " + u.getName() + "\n");
            sb.append("Camouflage color: " + u.getCamouflageColor() + "\n");
            sb.append("Weapon: " + u.getWeapon() + "\n");
            sb.append("Attack power: " + u.getAttackPower() + "\n");
            sb.append("Protection power: " + u.getProtectionPower() + "\n");
            sb.append("---\n");
        }

        return sb.toString();
    }
}
