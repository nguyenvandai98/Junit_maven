package lab02.bai03;

import org.junit.*;

import java.util.ArrayList;

public class JunitAnnotationExample {

    private ArrayList<String> list ;

    @BeforeClass
    public  static  void m1(){
        System.out.println("Using @BeforeClass , executed before all test case");
    }

    @Before
    public  void m2(){
        list = new ArrayList<String>();
        System.out.println("Using @Before annotations, executed before each test case");
    }

    @After
    public  void m4(){
        System.out.println("Using @AfterClass, execute after all test case");
    }

    @Test
    public void m5(){
        list.add("Test");
        Assert.assertFalse(list.isEmpty());
        Assert.assertEquals(1,list.size());

    }
    @Ignore
    public  void m6(){
        System.out.println("Using @Ignore, this execution is ignore");

    }
    @Test(timeout = 10)
    public  void m7(){
        System.out.println("Using @Test(timeout, it can be use to enforce timeout in Junit4 test case");
    }


}
