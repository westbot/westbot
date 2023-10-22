// Реализация интерфейса фабрики для создания юнитов немецкой армии

public class GermanFactory implements ArmyFactory {
    public Soldier createSoldier() {
        return new Soldier("Fric", "Grey", "Shmaiser", 5, 3);
    }

    public Tank createTank() {
        return new Tank("Ferdinand", "Grey", "Cannon", 20, 12);
    }

    public Cannon createCannon() {
        return new Cannon("Pak 41", "Grey", "4,2 cm cannon", 22, 7);
    }
}
