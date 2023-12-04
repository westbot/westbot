import java.lang.Exception;

public class ToolNotFoundException extends Exception {
    public ToolNotFoundException() {
        super("Tool not found!");
    }
}
