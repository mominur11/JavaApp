package SoftwareDesign;

public class DependencyInversion {

    public static void main(String[] args){

        LoggingToFile fileLogger = new LoggingToFile(new Logger());
        fileLogger.logging();
    }
}

class Logger{
    public void logInformatioon(String logInfo){
        System.out.println(logInfo);
    }
}

class LoggingToFile{
    private Logger logger;

    public LoggingToFile(Logger logger){
        this.logger = logger;
    }

    public void logging(){
        logger.logInformatioon("Printing Logs to the file......");
    }
}
