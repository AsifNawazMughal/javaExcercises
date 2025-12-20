package ExceptionHandling;

public class FinalExceptionHandling {

    public static void main(String[] args) {
        System.out.println("Start of the program");
        System.out.println("A");

        try{
            System.out.println(10/0);
        }catch (Exception e){
            System.out.println(e + " caught");
        }finally{
            System.out.println("This is finally block");
            System.out.println("B");
        }
        
    }

}   

