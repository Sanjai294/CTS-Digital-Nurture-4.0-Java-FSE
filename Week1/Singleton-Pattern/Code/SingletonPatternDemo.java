public class SingletonPatternDemo {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("Application started.");

        Logger logger2 = Logger.getInstance();
        logger2.log("This is a singleton logger.");

        System.out.println("Are both loggers same? " + (logger1 == logger2));
    }
}
