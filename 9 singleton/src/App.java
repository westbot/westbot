public class App {
    public static void main(String[] args) throws InterruptedException {
        Worker w1 = new Worker("Работник1", ConsoleLogger.getInstance());
        Worker w2 = new Worker("Работник2", ConsoleLogger.getInstance());

        for ( LogLevel l : LogLevel.values() ) {
            w1.generate(l);
            Thread.sleep(500);
            w2.generate(l);
            Thread.sleep(500);
        }
    }
}
