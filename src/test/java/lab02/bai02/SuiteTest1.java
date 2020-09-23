package lab02.bai02;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


public class SuiteTest1 {
    static   String message = "Fpoly";
    static JUnitMessage jUnitMessage;

    @BeforeClass
    public static void setUp(){
    jUnitMessage = new JUnitMessage(message);
    }

    @Test(expected = ArithmeticException.class)
    public void testPrintMessage(){
        System.out.println("Junit Message is printing");
        jUnitMessage.printMessage();
    }
    @Test
    public  void testJUnitHiMessage(){
        message = "Hi! "+ message;

        System.out.println("JUnit Hi Message is printing");
        Assert.assertEquals(message,jUnitMessage.printHiMessage());
        System.out.println("Suite Test 1 is successful "+ message);
    }




}
