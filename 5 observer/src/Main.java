public class Main {
    public static void main(String[] args) {
        Investor vasya = new Investor("Vasya");
        Investor kolya = new Investor("Kolya");
        Investor petya = new Investor("Petya");

        Action gazprom = new Action("GazProm", 170.0, 20.0);
        gazprom.subscribe(vasya);

        Action sber = new Action("SBER", 270.0, 30);
        sber.subscribe(kolya);
        sber.subscribe(petya);

        Stock mmvb = new Stock("MMVB");
        mmvb.subscribe(gazprom);
        mmvb.subscribe(sber);

        for (int i = 0; i < 3; ++i) {
            mmvb.nextSession();
            System.out.println();
        }

        sber.unsubscribe(petya);
        sber.subscribe(vasya);
        gazprom.subscribe(petya);

        mmvb.nextSession();
    }
}