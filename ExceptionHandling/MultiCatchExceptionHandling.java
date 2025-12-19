package ExceptionHandling;

public class MultiCatchExceptionHandling {
    public static void main(String[] args){
        String s1 = null;
        try{
                    System.out.println(s1.length());

        System.out.println(10/0);
    }
        // } catch(NullPointerException | ArithmeticException ex){
        //     System.out.println("Exception caught");
        //     System.out.println(ex.getMessage());
        // }

        catch(NullPointerException ex){
            System.out.println("Null Pointer Exception caught");
            System.out.println(ex.getMessage());
        } catch(ArithmeticException ex){
            System.out.println("Arithmetic Exception caught");
            System.out.println(ex.getMessage());
        }
        System.out.println("A");
        System.out.println("B");


    }
}
