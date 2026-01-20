package LoginPage;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Login1  extends JFrame{

    Font headingFont = new Font("Arial", Font.BOLD,30);
    Font labelFont = new Font("Arial", Font.ITALIC,20);

    JLabel l1,l2,l3,l4;
    JTextField t1;
    JPasswordField t2; 
    JButton b1,b2;

    Cursor c1 = new Cursor(Cursor.HAND_CURSOR);

    Login1(){ }
    Login1(String s){   super(s);   }
    
    void setComponents(){
        l1 = new JLabel("Login From");
        l2 = new JLabel("Username");
        l3 = new JLabel("Password");
        l4 = new JLabel();
        t1 = new JTextField();
        t2 = new JPasswordField();
        l1.setFont(headingFont);
        l1.setForeground(Color.RED);
        l2.setFont(labelFont);
        l2.setForeground(Color.BLUE);
        l3.setFont(labelFont);
        l3.setForeground(Color.BLUE);

        b1 = new JButton("Login");
        b2 = new JButton("Clear");
        b1.setCursor(c1);
        b2.setCursor(c1);

        setLayout(null);
        l1.setBounds(300,50,300,70);
        l2.setBounds(200,150,100,30);
        t1.setBounds(300,150,200,30);
        l3.setBounds(200,250,100,30);
        t2.setBounds(300,250,200,30);
        b1.setBounds(200,350,100,30);
        b2.setBounds(400,350,100,30);
        l4.setBounds(300,500,300,30);

        add(l1);
        add(l2);
        add(t1);
        add(l3);
        add(t2);
        add(b1);    
        add(b2);
        add(l4);

        b1.addActionListener(new log());
        b1.setBackground(Color.RED);
        b1.setForeground(Color.WHITE);
        b2.addActionListener(new clear());
        
    }

    public static void main(String[] args){
        Login1 f1 = new Login1("Login From");
        f1.setComponents();
        f1.setVisible(true);
        f1.setSize(800,800);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    class log implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String s1 = t1.getText();
            String s2 = t2.getText();

            if(s1.equals("asifnawaz") && s2.equals("3000")){
                l4. setText("Login Successful");
            } else{
                l4.setText("Login Failed");
            }
        }
    }

    class clear implements ActionListener{
        public void actionPerformed(ActionEvent e){
            t1.setText("");
            t2.setText("");
            l4.setText("");
        }
    }   
}