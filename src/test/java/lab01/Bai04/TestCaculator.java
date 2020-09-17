package lab01.Bai04;

import org.junit.Assert;
import org.junit.Test;

public class TestCaculator {

    @Test
    public void testSumCase1(){
        Caculator caculator = new Caculator();
        int kpMongMuon = 3;
        int kqThucTe = caculator.sum(6,-3);
        Assert.assertEquals(kpMongMuon,kqThucTe);
    }
    @Test
    public void testSubtractCase1(){
        Caculator caculator = new Caculator();
        int kpMongMuon = 9;
        int kqThucTe = caculator.suntract(6,-3);
        Assert.assertEquals(kpMongMuon,kqThucTe);
    }
    @Test
    public void testMultipleCase1(){
        Caculator caculator = new Caculator();
        int kpMongMuon = 9;
        int kqThucTe = caculator.multiple(3,3);
        Assert.assertEquals(kpMongMuon,kqThucTe);
    }
    @Test
    public void testDivineCase1() throws Exception {
        Caculator caculator = new Caculator();
        double kpMongMuon = 1.5;
        double kqThucTe = caculator.divide(3,2);

        Assert.assertEquals(kpMongMuon,kqThucTe, 0.3f);
    }

}
