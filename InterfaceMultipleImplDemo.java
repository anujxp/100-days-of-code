/*
InterfaceMultipleImplDemo.java
Shows how a single interface is implemented differently by multiple classes.
Example: Logger interface with ConsoleLogger and FileLogger (simulation).
Compile:
  javac InterfaceMultipleImplDemo.java
Run:
  java InterfaceMultipleImplDemo
*/

interface Logger {
    void info(String msg);
    void error(String msg);
}

class ConsoleLogger implements Logger {
    public void info(String msg) { System.out.println("[INFO ] " + msg); }
    public void error(String msg) { System.err.println("[ERROR] " + msg); }
}

class FileLogger implements Logger {
    // Simulate file logging by printing with FILE prefix
    public void info(String msg) { System.out.println("[FILE-INFO] " + msg); }
    public void error(String msg) { System.out.println("[FILE-ERROR] " + msg); }
}

class InterfaceMultipleImplDemo {
    public static void runDemo(Logger logger) {
        logger.info("Application started");
        logger.error("Something went wrong");
    }

    public static void main(String[] args) {
        System.out.println("=== Interface Multiple Implementation Demo ===");
        Logger console = new ConsoleLogger();
        Logger file = new FileLogger();

        System.out.println("-- Using ConsoleLogger --");
        runDemo(console);

        System.out.println("-- Using FileLogger --");
        runDemo(file);
    }
}
