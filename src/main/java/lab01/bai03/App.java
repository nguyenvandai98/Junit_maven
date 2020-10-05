package lab01.bai03;

import lab01.bai04.Caculator;

public class App {
    private Caculator calculator;

    public App() {
    }

    public  boolean isEventNumber(int input){
        if(input%2==0){
            return true;
        }else {
            return false;
        }
    }

    public App(Caculator calculator) {
        this.calculator = calculator;
    }

    public int doSomething(){
        int result = 0;
        return calculator.sum(1,3);
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
