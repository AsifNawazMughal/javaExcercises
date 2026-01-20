import javax.swing.*;

public class LabelandText extends JFrame{

    LabelandText(){ }
    LabelandText(String s){    super(s);   }

    void setComponents(){
        JLabel l1 = new JLabel("Welcome ");
        JTextField t1 = new JTextField();

        setLayout(null);
        l1.setBounds(300,100,200,50);
        t1.setBounds(300,150,200,20);

        add(l1);
        add(t1);
    }

    public static void main(String[] args){
        LabelandText f1 = new LabelandText("Welcome to java ");
        f1.setComponents();
        f1.setVisible(true);
        f1.setSize(800,800);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    

}

