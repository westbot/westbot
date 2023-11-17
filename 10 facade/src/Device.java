public class Device {
    private String name;
    private Status status;

    public Device(String name) {
        this.name = name;
        this.status = Status.OFF;
    }

    public String getName() {
        return name;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }
}
