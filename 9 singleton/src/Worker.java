public class Worker {
    private String name;
    private Logger logger;

    public Worker(String name, Logger logger) {
        this.name = name;
        this.logger = logger;
    }

    public void generate(LogLevel level) {
        String s = name + ": ";

        switch (level) {
            case INFO:
                s += "Запустился, работаю...";
                break;
            case WARNING:
                s += "Как-то кривенько пошло...";
                break;
            case CRITICAL:
                s += "Ой-ой! Все плохо!";
                break;
            case FATAL:
                s += "Поздравлляю! Всё погибло!";
                break;
            default:
                s+= "Что-то странное здесь происходит!";
                break;
        }

        logger.log(level, s);
    }
}
