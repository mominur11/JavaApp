package SoftwareDesign;

public class DependencyInversionMain {

    public static void main(String[] args){

        LoggingToFiles fileLoggers = new LoggingToFiles(new Loggers());
        fileLoggers.loggings();

        LoggingToDb fileLoggers2 = new LoggingToDb(new Loggers());
        fileLoggers2.loggings();
    }
}

interface ILoggers{
    public void logInformatioons(String logInfos);
}

class Loggers implements ILoggers{
    public void logInformatioons(String logInfos){
        System.out.println(logInfos);
    }
}

class LoggingToFiles{
    private ILoggers loggers;

    public LoggingToFiles(ILoggers loggers){
        this.loggers = loggers;
    }

    public void loggings(){
        loggers.logInformatioons("Printing Logs to the file......__");
    }

}

class LoggingToDb{
    private ILoggers loggers;

    public LoggingToDb(ILoggers loggers){
        this.loggers = loggers;
    }

    public void loggings(){
        loggers.logInformatioons("Saving Logs to the Database......__");
    }

}