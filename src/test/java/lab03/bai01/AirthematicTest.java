package lab03.bai01;

import org.junit.Assert;
import org.junit.Test;

public class AirthematicTest {
    public String message = "Fpoly Exception";
    JunitMessage junitMessage = new JunitMessage(message);

    @Test(expected = ArithmeticException.class)
    public void testJUintMessage() throws Exception{
        System.out.println("Fpoly JUnit message exception is printing");
        junitMessage.printMessage();
    }

    @Test
    public  void testJUnitHiMessage(){
        message = "Hi! " + message;
        System.out.println("Fpoly Juint Message is printing");
        Assert.assertEquals(message,junitMessage.printHiMessage());
    }
}
