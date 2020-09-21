package lab02.bai01;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class MathFuncRunTest {

    public static void main(String[] args) {
        JUnitCore jUnitCore = new JUnitCore();
        Result result = jUnitCore.run(MathFuncTest.class);
        System.out.println("run tests: "+ result.getRunCount());
        System.out.println("failed test: "+ result.getFailureCount());
        System.out.println("ignored tests: "+ result.getIgnoreCount());
        System.out.println("success: "+ result.wasSuccessful());
    }
}
