package dev4.goit;

public class LoggingControl implements LoggingControlMBean {
    private boolean loggingEnabled = true;

    @Override
    public void enableLogging() {
        loggingEnabled = true;
    }

    @Override
    public void disableLogging() {
        loggingEnabled = false;
    }

    @Override
    public boolean isLoggingEnabled() {
        return loggingEnabled;
    }
}