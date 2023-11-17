public class Light extends Device {
    public Light() {
        super("свет");
    }

    @Override
    public void setStatus(Status status) {
        switch (status) {
            case ON:
                System.out.println("Свет зажёгся.");
                break;
            case OFF:
                System.out.println("Свет погас.");
                break;
            default:
                break;
        }
        super.setStatus(status);
    }
}
