public class WarGame {
    public static void main(String[] args) {
        // Красная армия (СССР)
        Army russian = new Army("Red army", new RussianFactory());
        // Вермахт (Германия)
        Army german = new Army("Vermaht", new GermanFactory());

        // Создаём по юниту разных типов для демонстрации
        russian.addCannon();
        russian.addSoldier();
        russian.addTank();

        german.addTank();
        german.addSoldier();
        german.addCannon();

        // Выводим информацию о юнитах для каждой армии
        System.out.println(russian.getSummary());
        System.out.println();
        System.out.println(german.getSummary());
    }
}
