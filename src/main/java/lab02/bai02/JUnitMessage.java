package lab02.bai02;

public class JUnitMessage {
     String message;

    public JUnitMessage(String message) {
        this.message = message;
    }

    public  String printMessage(){
        System.out.println(message);
        throw  new ArithmeticException();
    }

    public String printHiMessage(){
        return "Hi! "+ message;
    }


}
