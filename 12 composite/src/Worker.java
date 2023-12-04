public class Worker implements Mercenary {
    private String role;
    private double salary;

    public Worker(String role, double salary) {
        this.role = role;
        this.salary = salary;
    }

    @Override
    public String getRole() {
        return role;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void changeSalary(double percents) {
        salary += salary / 100.0 * percents;
    }
}
