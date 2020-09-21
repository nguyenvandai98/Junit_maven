package lab01.Bai03;

import junit.framework.TestCase;
import lab01.bai03.App;
import org.junit.Test;

public class AppTest extends TestCase {

    public  AppTest (String testName){
        super(testName);
    }

    public void testApp(){
        assertTrue(true);
    }
    @Test
    public void testIsEventNumber2(){
        App demo1 = new App();
        boolean result = demo1.isEventNumber(2);
        assertTrue(result);
    }
    @Test
    public void testIsEventNumber4(){
        App demo1 = new App();
        boolean result = demo1.isEventNumber(4);
        assertTrue(result);
    }
}
