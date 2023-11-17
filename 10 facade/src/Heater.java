public class Heater extends Device {
    public Heater() {
        super("обогреватель");
    }

    @Override
    public void setStatus(Status status) {
        switch(status) {
            case ON:
                System.out.println("Обогреватель греется.");
                break;
            case OFF:
                System.out.println("Обогреватель остывает.");
                break;
            default:
                break;
        }

        super.setStatus(status);
    }
}
