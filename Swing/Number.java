import javax.swing.*;
import java.awt.*;

class Combo{
    JFrame f;
    JLabel l1;
    JComboBox c1;
    Combo(){
        f=new JFrame();
        f.setLayout(null);
        f.setSize(800, 1000);
        f.setTitle("Number Selector");

        l1=new JLabel("Select a number. ");
        l1.setFont(new Font("arial",1,30));
        l1.setBounds(10,10,350,50);
        f.add(l1);

        c1=new JComboBox();
        for(int i=0;i<=100;i++){
            c1.addItem(i);
        }
        c1.setFont(new Font("arial",1,30));
        c1.setBounds(400,10,350,50);
        f.add(c1);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}

public class Number {
    public static void main(String args[]){
        new Combo();
    }
}
