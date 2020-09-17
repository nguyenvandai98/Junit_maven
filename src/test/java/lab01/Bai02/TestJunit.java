package lab01.Bai02;

import org.junit.Assert;
import org.junit.Test;


public class TestJunit {
    @Test
    public  void testSetup(){
        String str = "I am done with Junit setup";
        Assert.assertEquals("I am done with Junit setup",str);
        Assert.assertEquals("I am done with Junit false",str);

    }
}
