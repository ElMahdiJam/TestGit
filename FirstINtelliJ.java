import java.io.FileReader;

public class FirstINtelliJ {
    public static int addition( int a , int b){
        int result = a+b;
        return result;
    }
    public static void main (String []args){
       int numOfApple =8;
       int y =9;
       int total = numOfApple-3;
       FirstINtelliJ obj = new FirstINtelliJ();
       int result = obj.addition(total,numOfApple);
        System.out.println("the result is "+result);
    }

}
