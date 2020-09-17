package lab01.Bai02;

import lab01.Bai02.TestJunit;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class TestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestJunit.class);

//        List<String> list = result.getFailures().stream().map(failure ->
//               failure.getMessage()
//        ).collect(Collectors.toList());

        result.getFailures().stream().forEach(System.out::println);
        System.out.println("Result == "+ result.wasSucxcessful());

//        for (Failure failure : result.getFailures()){
//            System.out.println(failure.toString());
//        }

    }
}
