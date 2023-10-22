// Интерфейс Фабрика армии (по сути абстрактная фабрика)
// объявляет методы для создания юнитов разных типов

public interface ArmyFactory {
    public Soldier createSoldier();
    public Tank createTank();
    public Cannon createCannon();
}
