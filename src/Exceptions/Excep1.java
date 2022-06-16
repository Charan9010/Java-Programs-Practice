package Exceptions;

public class Excep1 {
    public static void main(String[] args) {
        try{
            int divide=100/20;
            System.out.println("division");
        }
        catch (ArithmeticException e){
            System.out.println("error is occurred ");

        }
        finally{
            System.out.println("finally rectified");
        }
    }
}
