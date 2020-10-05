package lab03.Parameterized;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.beans.Transient;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ArithmaticTest {
    private int firstNumber;
    private int secondNumber;
    private int expectedResult;
    private Airthematic airthematic;


    public ArithmaticTest(int firstNumber, int secondNumber, int expectedResult) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.expectedResult = expectedResult;
    }


    @Before
    public void init(){
        this.airthematic = new Airthematic();
    }
    @Parameterized.Parameters
    public static Collection intParams(){
        return Arrays.asList(new Object[][]{
                {1,2,3},
                {4,5,9},
                {12,39,51},
                {27,9,36}
        });
    }

    @Test
    public void testAirthematic(){
        Assert.assertEquals(this.expectedResult,this.airthematic.sum(this.firstNumber,this.secondNumber));
    }

}
