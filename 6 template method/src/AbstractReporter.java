public abstract class AbstractReporter {
    protected void printHeader() {
        System.out.println("Printing header.");
    }

    protected abstract void printBody();

    protected void printFooter() {
        System.out.println("Printing footer.");
    }

    public final void makeReport() {
        printHeader();
        printBody();
        printFooter();
    }
}
