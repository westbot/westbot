// Класс Абстрактный юнит имплементирует интерфейс Юнит
// Назначение - предотвратить дублирование кода в классах Солдат, Танк и Пушка
public abstract class AbstractUnit implements Unit {
    private String name;
    private String camouflageColor;
    private String weapon;
    private int attackPower;
    private int protectionPower;

    // Конструктор
    public AbstractUnit(String name, String camouflageColor, String weapon, int attackPower, int protectionPower) {
        this.name = name;
        this.camouflageColor = camouflageColor;
        this.weapon = weapon;
        this.attackPower = attackPower;
        this.protectionPower = protectionPower;
    }

    // Методы, объявленные в интерфейсе Юнит

    // Абстрактный метод, выводящий тип юнита. Должен быть переопределён в классах-потомках
    public abstract String getType();

    public String getName() {
        return this.name;
    }

    public String getCamouflageColor() {
        return this.camouflageColor;
    }

    public String getWeapon() {
        return this.weapon;
    }

    public int getAttackPower() {
        return this.attackPower;
    }

    public int getProtectionPower() {
        return this.protectionPower;
    }
}
