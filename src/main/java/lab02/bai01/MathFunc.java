package lab02.bai01;

public class MathFunc {
    int calls;
     public  int getCalls(){
         return  calls;
     }

     public long factorial(int number) throws IllegalAccessException {
         calls ++;

         if(number <0)
             throw new IllegalAccessException();
         long result = 1;

         if(number >1){
             for(int i=1; i<= number; i++)
                 result = result * i;
         }
         return result;
     }

     public long plus(int num1, int num2){
         calls ++;
         return  num1 + num2;
     }
}
