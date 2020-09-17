import org.junit.Assert;
import org.junit.Test;

public class test {
    @Test
    public void testHelloWorldSuccess() {
        String str = "Hello World";
        Assert.assertEquals("Hello World", str);
    }

    @Test
    public void testHelloWorldFailure() {
        String str = "Hello World";
        Assert.assertEquals("Hello Poly", str);
    }

}
