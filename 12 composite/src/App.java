public class App {
    public static void main(String[] args) {
        Unit company = new Unit("ООО \"Рога и Копыта\"");
        company.addSubunit(new Worker("Директор", 10000.0));
        company.addSubunit(new Worker("Секретарша", 2000.0));

        Unit bookkeeping = new Unit("Бухгалтерия");
        bookkeeping.addSubunit(new Worker("Главбух", 7000.0));
        bookkeeping.addSubunit(new Worker("Бухгалтер", 1500.0));
        company.addSubunit(bookkeeping);

        Unit manufacture = new Unit("Производство");
        manufacture.addSubunit(new Worker("Управляющий", 3000.0));

        Unit brigade1 = new Unit("Бригада #1");
        brigade1.addSubunit(new Worker("Работник #1", 500.0));
        brigade1.addSubunit(new Worker("Работник #2", 300.0));
        manufacture.addSubunit(brigade1);

        Unit brigade2 = new Unit("Бригада #2");
        brigade2.addSubunit(new Worker("Работник #1", 700.0));
        brigade2.addSubunit(new Worker("Работник #2", 400.0));
        manufacture.addSubunit(brigade2);

        company.addSubunit(manufacture);

        System.out.println("Информация о предприятии:");
        company.printStructure();
        System.out.println("Общий расход на заработную плату: " + String.format("%.2f",  company.getSalary()));

        System.out.println("\nВсем подняли зарплату на 5%...");
        company.changeSalary(5.0);
        company.printStructure();
        System.out.println("Общий расход на заработную плату: " + String.format("%.2f",  company.getSalary()));
    }
}
