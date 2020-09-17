package lab01.Bai04;

public class Caculator {
    public int sum(int a, int b){
        return a+b;
    }
    public int suntract(int a, int b){
        return a-b;
    }
    public int multiple(int a, int b){
        return a*b;
    }
    public double divide(int a, int b) throws Exception {
        if (b==0) throw new Exception("Wrong");
        return (double) a/b;
    }
}
