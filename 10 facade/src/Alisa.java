import java.util.Map;
import java.util.HashMap;

public class Alisa {
    private Map<String, Device> devices;

    public Alisa() {
        devices = new HashMap<>();
    }

    public void addDevice(Device device) {
        devices.put(device.getName(), device);
    }

    public void doCommand(String command) {
        String[] parts = command.split(" ");
        if ( parts.length != 3 || ! parts[0].equals("Алиса,") )
            return;

        Status new_status;

        if ( parts[1].equals("включи") )
            new_status = Status.ON;
        else if ( parts[1].equals("выключи") )
            new_status = Status.OFF;
        else {
            System.out.println("Команда не распознана.");
            return;
        }

        if ( ! devices.containsKey(parts[2]) ) {
            System.out.println("Устройство не найдено.");
            return;
        }

        Device device = devices.get(parts[2]);
        if ( device.getStatus() == new_status )
            System.out.println("Вы меня троллите!");
        else {
            System.out.println("Выполняю...");
            device.setStatus(new_status);
        }
    }
}
