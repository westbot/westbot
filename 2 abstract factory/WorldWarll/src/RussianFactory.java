// Реализация интерфейса фабрики для создания юнитов немецкой армии

public class RussianFactory implements ArmyFactory {
    public Soldier createSoldier() {
        return new Soldier("Ivan", "Green", "PPSh", 4, 4);
    }

    public Tank createTank() {
        return new Tank("T34", "Green", "Canon", 25, 20);
    }

    public Cannon createCannon() {
        return new Cannon("M42", "Green", "45 mm cannon", 15, 8);
    }
}
