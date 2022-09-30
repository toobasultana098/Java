import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Date;




class Digital implements Runnable{
    JFrame f;
    Thread t;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
    Digital(){
        t=new Thread(this);
        f=new JFrame();
        f.setLayout(null);
        f.setSize(500, 400);
        f.setTitle("Digital Clock");

        l1=new JLabel("Digital Clock");
        l1.setFont(new Font("arial",1,50));
        l1.setBounds(10,10,800,60);
        f.add(l1);

        l2=new JLabel("0");
        l2.setFont(new Font("arial",1,50));
        l2.setBounds(90,90,30,50);
        f.add(l2);

        l3=new JLabel("0");
        l3.setFont(new Font("arial",1,50));
        l3.setBounds(120,90,30,50);
        f.add(l3);

        l8=new JLabel(":");
        l8.setFont(new Font("arial",1,50));
        l8.setBounds(150,90,30,50);
        f.add(l8);

        l4=new JLabel("0");
        l4.setFont(new Font("arial",1,50));
        l4.setBounds(180,90,30,50);
        f.add(l4);

        l5=new JLabel("0");
        l5.setFont(new Font("arial",1,50));
        l5.setBounds(210,90,30,50);
        f.add(l5);

        l9=new JLabel(":");
        l9.setFont(new Font("arial",1,50));
        l9.setBounds(240,90,30,50);
        f.add(l9);


        l6=new JLabel("0");
        l6.setFont(new Font("arial",1,50));
        l6.setBounds(270,90,30,50);
        f.add(l6);

        l7=new JLabel("0");
        l7.setFont(new Font("arial",1,50));
        l7.setBounds(300,90,30,50);
        f.add(l7);

        


        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        t.start();
        f.setVisible(true);



    }
    public void run()
    {
        Date d=new Date();
        int h=d.getHours();
        int m=d.getMinutes();
        int s=d.getSeconds();
        
    }
}



public class Clock {
    public static void main(String args[]){
        new Digital();
    }
}
