public class Radio extends Device {
    public Radio() {
        super("радио");
    }

    @Override
    public void setStatus(Status status) {
        switch(status) {
            case ON:
                System.out.println("Радио поёт песенки.");
                break;
            case OFF:
                System.out.println("Радио молчит.");
        }

        super.setStatus(status);
    }
}
