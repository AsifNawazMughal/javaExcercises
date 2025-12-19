package ExceptionHandling;

public class SingleExceptionHandling {

    public static void main(String[] args) {

        String s1 = null;
        //nullIndexException Handling
        try{
           System.out.println(s1.length());
        } catch(NullPointerException ex){
            System.out.println("Null Pointer Exception caught");
            System.out.println(ex.getMessage());
        }
        
        System.out.println("A");
        try{
            System.out.println(10 / 0);
        } catch(ArithmeticException ex){
            System.out.println("Arithmetic Exception caught");
            System.out.println(ex.getMessage());
        }
      
        System.out.println("B");
    }

}
