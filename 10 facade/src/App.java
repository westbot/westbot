public class App {
    public static void main(String[] args) {
        Alisa alisa = new Alisa();
        alisa.addDevice(new Light());
        alisa.addDevice(new Heater());
        alisa.addDevice(new Radio());

        alisa.doCommand("Алиса, включи свет");
        alisa.doCommand("Алиса, включи радио");
        alisa.doCommand("Алиса, включи обогреватель");
        alisa.doCommand("Алиса, включи утюг");
        alisa.doCommand("Алиса, включи свет");
        alisa.doCommand("бу бу бу");
        alisa.doCommand("Алиса, туши свет");
        alisa.doCommand("Алиса, выключи свет");
        alisa.doCommand("Алиса, выключи обогреватель");
        alisa.doCommand("Алиса, выключи радио");
    }
}
