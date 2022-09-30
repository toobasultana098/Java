import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Count implements ActionListener{
    JFrame f;
    JLabel l1,l2,l3;
    JTextField t1,t2,t3;
    JButton b1;
    Count(){
        f=new JFrame();
        f.setLayout(null);
        f.setSize(800, 500);
        f.setTitle("Counter");

        l1=new JLabel("Type a Message Here !!");
        l1.setFont(new Font("arial",1,30));
        l1.setBounds(10,10,800,50);
        f.add(l1);

        t1=new JTextField();
        t1.setFont(new Font("arial",1,30));
        t1.setBounds(10,70,750,50);
        f.add(t1);

        b1=new JButton("Calculate");
        b1.setFont(new Font("arial",1,30));
        b1.setBounds(550,130,200,50);
        b1.addActionListener(this);
        f.add(b1);

        l2=new JLabel("Vowels");
        l2.setFont(new Font("arial",1,30));
        l2.setBounds(10,190,350,50);
        f.add(l2);

        t2=new JTextField();
        t2.setFont(new Font("arial",1,30));
        t2.setBounds(400,190,750,50);
        f.add(t2);

        l3=new JLabel("Consonants");
        l3.setFont(new Font("arial",1,30));
        l3.setBounds(10,250,350,50);
        f.add(l3);

        t3=new JTextField();
        t3.setFont(new Font("arial",1,30));
        t3.setBounds(400,250,750,50);
        f.add(t3);


        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        int c=0,v=0;
        String s=t1.getText();
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                v++;
            }
            else if(ch>='a' && ch<='z'){
                c++;
            }
        }    
        t2.setText(""+v);
        t3.setText(""+c);
    }
}



public class EX2 {
    public static void main(String args[]){
        new Count();
    }
}
