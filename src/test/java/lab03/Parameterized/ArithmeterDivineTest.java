package lab03.Parameterized;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ArithmeterDivineTest {
    private int a,b;
    private double excepted;
    private Airthematic airthematic;

    public ArithmeterDivineTest(int a, int b, double excepted) {
        this.a = a;
        this.b = b;
        this.excepted = excepted;
    }

    @Before
    public void init(){
        this.airthematic = new Airthematic();
    }

    @Parameterized.Parameters
    public static Collection initParams(){
        return Arrays.asList(new Object[][]
                {
                        {2,1,2},
                        {2,0,-1,ArithmeticException.class}
                });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSum(){
        Assert.assertEquals(this.excepted,this.airthematic.divine(a,b),03f);
    }

}
