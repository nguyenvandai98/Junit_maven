package lab02.bai01;

import org.junit.*;

public class MathFuncTest {
    private MathFunc mathFunc;
    @Before
    public void init(){mathFunc = new MathFunc();}
    @After
    public  void tearDown(){mathFunc = null;}

    @Test
    public  void calls() throws IllegalAccessException {
        Assert.assertEquals(0, mathFunc.getCalls());

        mathFunc.factorial(1);
        Assert.assertEquals(1,mathFunc.getCalls());

        mathFunc.factorial(1);
        Assert.assertEquals(2,mathFunc.getCalls());

    }

    @Test
    public  void testPlusSuccess(){
        System.out.println("Test function plus");
        int a= 2, b=3;
        long kpMongMuon = 5;
        Assert.assertEquals(5,this.mathFunc.plus(a,b));

    }

    @Test
    public  void testFactorialSuccess1() throws IllegalAccessException {
        int params = 1;
        System.out.println("Test function factorial");
        long result = this.mathFunc.factorial(params);
        Assert.assertEquals(1,result);
    }

    @Test
    public  void factorial() throws IllegalAccessException {
        Assert.assertTrue(mathFunc.factorial(0)==1);
        Assert.assertTrue(mathFunc.factorial(1)==1);
        Assert.assertTrue(mathFunc.factorial(5)==120);
    }

    @Test(expected = IllegalAccessException.class)
    public void factorialNegative() throws IllegalAccessException {
        mathFunc.factorial(-1);
    }

    @Ignore
    @Test
    public  void todo(){
        Assert.assertTrue(mathFunc.plus(1,1)==3);
    }
}
