package Calculator;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;;


public class CalculatorGUI{
    JFrame myFrame; 
    JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,badd,bsub,bmul,bdiv,beq,bdot,bclr;
    JLabel displayLablel;
    JTextField displayTextField;
    JPanel pButtons;


    public void initGUI(){
        Font f = new Font("Arial",Font.BOLD,30);
        Font f1 = new Font("Arial",Font.PLAIN,20);


        myFrame = new JFrame
        ("Caculator");
        b0 = new JButton("0");
        b1 = new JButton("1");  
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        badd = new JButton("+");
        bsub = new JButton("-");
        bmul = new JButton("*");
        bdiv = new JButton("/");
        beq = new JButton("=");
        bdot = new JButton(".");
        bclr = new JButton("C");

        displayLablel = new JLabel("Calculator");
        displayLablel.setVisible(true);
        displayLablel.setBounds(50,50,100,30);
        displayLablel.setFont(f1);
        displayLablel.setForeground(Color.BLUE);
        displayTextField = new JTextField(20);
        displayTextField.setFont(f);
        displayLablel.setBounds(50,100,300,50);
        displayLablel.setForeground(Color.BLACK);
        pButtons = new JPanel();
        pButtons.setLayout(new GridLayout(4,4));
        pButtons.setBounds(50,200,300,300); 

    pButtons.add(b1);  
pButtons.add(b2);  
pButtons.add(b3); 
pButtons.add(bclr);  
pButtons.add(b4);  
pButtons.add(b5);  
pButtons.add(b6);  
pButtons.add(bmul); 
 pButtons.add(b7);  
pButtons.add(b8); 
 pButtons.add(b9); 
 pButtons.add(bsub); 
 pButtons.add(b0);  
pButtons.add(bdot); 
 pButtons.add(badd);  
pButtons.add(beq); 
// getting componenet area of JFrame 
Container con = myFrame.getContentPane(); 
con.setLayout(new BorderLayout()); 
//adding components to container  
con.add(displayTextField, BorderLayout.NORTH);  
con.add(displayLablel, BorderLayout.SOUTH);  
con.add(pButtons, BorderLayout.CENTER); 
myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
myFrame.setSize(300, 300); 
myFrame.setVisible(true); 
} //end initGUI method 
public CalculatorGUI () { // default constructor  
initGUI (); 
} 
public static void main (String args[ ]) { 
CalculatorGUI calGUI = new CalculatorGUI (); 
} 

}


