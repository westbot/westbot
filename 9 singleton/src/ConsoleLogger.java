import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ConsoleLogger implements Logger{
    private static final PrintStream out = System.out;
    private ConsoleLogger() {}

    @Override
    public void log(LogLevel level, String message) {
        String str = String.format("%s %s %s",
                new SimpleDateFormat("yyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime()),
                level, message);
        out.println(str);
    }

    private static class LoggerHolder {
        public static final ConsoleLogger INSTANCE = new ConsoleLogger();
    }

    public static ConsoleLogger getInstance() {
        return LoggerHolder.INSTANCE;
    }
}
