public class Main {
    public static void main(String[] args) {
        AbstractReporter[] reporters = new AbstractReporter[] {
                new GraphReporter(),
                new TextReporter(),
                new TableReporter()
        };

        for (var r : reporters) {
            r.makeReport();
            System.out.println();
        }
    }
}