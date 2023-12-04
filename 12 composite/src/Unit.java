import java.util.List;
import java.util.ArrayList;

public class Unit implements Mercenary {
    private String role;
    private List<Mercenary> subunits;

    public Unit(String role) {
        this.role = role;
        this.subunits = new ArrayList<>();
    }

    public void addSubunit(Mercenary unit) {
        subunits.add(unit);
    }

    private void printStructure(int indent) {
        for (int i = 0; i < indent; ++i )
            System.out.print("\t");
        System.out.println(role);
        for (Mercenary unit : subunits) {
            if (unit instanceof Unit)
                ((Unit) unit).printStructure(indent + 1);
            else {
                for (int i = 0; i < indent + 1; ++i)
                    System.out.print("\t");
                System.out.println("Должность: " + unit.getRole() + ", Оклад: $" + String.format("%.2f", unit.getSalary()));
            }
        }
    }

    public void printStructure() {
        printStructure(0);
    }

    @Override
    public String getRole() {
        return role;
    }

    @Override
    public double getSalary() {
        double total = 0.0;

        for (Mercenary unit : subunits)
            total += unit.getSalary();

        return total;
    }

    @Override
    public void changeSalary(double percents) {
        for (Mercenary unit : subunits)
            unit.changeSalary(percents);
    }
}
