package lab03.ErrorCollectorExample;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class ErrorCollectorExample {
    @Rule
    public ErrorCollector collector = new ErrorCollector();
    @Test
    public void testCollector(){
        collector.addError(new Throwable("Error1"));
        collector.addError(new Throwable("Error2"));
        try{
            Assert.assertEquals("A","B");
        }catch (Throwable t){
            collector.addError(t);
        }
        System.out.println("Done");
    }
}
