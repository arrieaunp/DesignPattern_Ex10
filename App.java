public class App {
    public static void main(String[] args) {
        Logger errLogger = new ErrorLogger(Logger.ERROR);
        Logger fileLogger = new FileLogger(Logger.DEBUG);
        Logger consoleLogger = new ConsoleLogger(Logger.INFO);
        
        errLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        errLogger.logMessage(Logger.INFO, "This is an information.");
        errLogger.logMessage(Logger.DEBUG, "This is a debug information.");
        errLogger.logMessage(Logger.ERROR, "This is an error information.");

    }
}