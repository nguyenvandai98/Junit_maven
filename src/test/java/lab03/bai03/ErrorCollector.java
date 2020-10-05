package lab03.bai03;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;

public class ErrorCollector {
    @Rule
    public org.junit.rules.ErrorCollector collector = new org.junit.rules.ErrorCollector();
    @Test
    public void example(){
        collector.addError(new Throwable("There is an Error first line"));
        collector.addError(new Throwable("There is an error in second line"));
        System.out.println("Hello");
        try{
            Assert.assertEquals("A","B");
        }catch (Throwable t){
            collector.addError(t);
        }
        System.out.println("World!!!!!");
    }
}
