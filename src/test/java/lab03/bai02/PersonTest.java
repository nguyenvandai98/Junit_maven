package lab03.bai02;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.internal.runners.statements.Fail;
import org.junit.rules.ExpectedException;

public class PersonTest {
    @Rule
    public ExpectedException expectedException = ExpectedException.none();
    @Test
    public  void testExceptedException(){
        expectedException.expect(IllegalArgumentException.class);
        new Person("Lưu Quỳnh Dư",-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testExpectedException2(){
        new Person("Adam", -1);
    }
    @Test()
    public void testExpectedException3(){
        try{
            new Person("Adam", -1);
            Assert.fail("Should have throw an IlegalArgumentException");
        }catch (IllegalArgumentException e){
            e.printStackTrace();
        }

    }
}
