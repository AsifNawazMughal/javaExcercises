import javax.swing.*;
public class LoginS extends JFrame {
    //Making constructors 
    LoginS(){

    }
    // Constructor with title
    LoginS(String s){
        super(s);
    }

    public static void main(String[] args){
        LoginS l1 =  new LoginS("Login From");
        l1.setSize(899,899);
        l1.setVisible(true);
        l1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    
}
