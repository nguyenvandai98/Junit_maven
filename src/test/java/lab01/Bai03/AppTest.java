package lab01.Bai03;

import junit.framework.TestCase;
import lab01.bai03.App;
import lab01.bai04.Caculator;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

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
    @Test
    public void testDoSomething(){
        Caculator mock = Mockito.mock(Caculator.class);
        App app = new App(mock);
        Mockito.when(mock.sum(1,3)).thenReturn(4);
        int result = app.doSomething();
        Assert.assertEquals(4,result);
    }

}
