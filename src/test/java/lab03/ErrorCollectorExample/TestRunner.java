package lab03.ErrorCollectorExample;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class TestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(ErrorCollectorExample.class);
      result.getFailures().forEach(System.out::println);

        System.out.println("Result == "+result.wasSuccessful());
    }

}

