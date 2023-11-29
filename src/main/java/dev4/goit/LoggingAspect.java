package dev4.goit;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
    private static boolean loggingEnabled = true;

    @Before("execution(* sergey.goit.Convector.convert(String)) && args(input)")
    public void beforeConvertMethod(String input) {
        if (loggingEnabled) {
            System.out.println("Original Value: " + input);
        }
    }

    @AfterReturning("execution(* sergey.goit.Convector.convert(String))")
    public void afterConvertMethod(String result) {
        if (loggingEnabled) {
            System.out.println("Converted : " + result);
        }
    }

    public static void enableLogging() {
        loggingEnabled = true;
    }

    public static void disableLogging() {
        loggingEnabled = false;
    }

    public static boolean isLoggingEnabled() {
        return loggingEnabled;
    }
}
