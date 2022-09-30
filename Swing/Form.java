import javax.swing.*;
import java.awt.*;

class Student {
    JFrame f;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
    JTextField t1,t2,t3;
    JButton b1;
    JRadioButton r1,r2;
    JPasswordField p1,p2;
    JComboBox c1,c2,c3;
    Student(){
        f=new JFrame();
        f.setLayout(null);
        f.setSize(1000, 1000);
        f.setTitle("Student Register Form");


        l1=new JLabel("Register a new Student");
        l1.setFont(new Font("arial",1,50));
        l1.setBounds(10,10,800,60);
        f.add(l1);


        l2=new JLabel("Name");
        l2.setFont(new Font("arial",1,30));
        l2.setBounds(10,90,400,50);
        f.add(l2);

        t1=new JTextField();
        t1.setFont(new Font("arial",1,30));
        t1.setBounds(450,90,300,50);
        f.add(t1);


        l3=new JLabel("DOB");
        l3.setFont(new Font("arial",1,30));
        l3.setBounds(10,150,400,50);
        f.add(l3);


        l4=new JLabel("Gender");
        l4.setFont(new Font("arial",1,30));
        l4.setBounds(10,210,400,50);
        f.add(l4);

        r1=new JRadioButton("Male");
        r1.setFont(new Font("arial",1,30));
        r1.setBounds(450,210,150,50);
        f.add(r1);

        r2=new JRadioButton("Female");
        r2.setFont(new Font("arial",1,30));
        r2.setBounds(700,210,300,50);
        f.add(r2);


        l5=new JLabel("Mail ID");
        l5.setFont(new Font("arial",1,30));
        l5.setBounds(10,270,400,50);
        f.add(l5);

        t2=new JTextField();
        t2.setFont(new Font("arial",1,30));
        t2.setBounds(450,270,300,50);
        f.add(t2);


        l6=new JLabel("Mobile no.");
        l6.setFont(new Font("arial",1,30));
        l6.setBounds(10,330,400,50);
        f.add(l6);

        t3=new JTextField();
        t3.setFont(new Font("arial",1,30));
        t3.setBounds(450,330,300,50);
        f.add(t3);


        l7=new JLabel("Password");
        l7.setFont(new Font("arial",1,30));
        l7.setBounds(10,390,400,50);
        f.add(l7);

        p1=new JPasswordField();
        p1.setFont(new Font("arial",1,30));
        p1.setBounds(450,390,300,50);
        f.add(p1);


        l8=new JLabel("Re Password");
        l8.setFont(new Font("arial",1,30));
        l8.setBounds(10,450,400,50);
        f.add(l8);

        p2=new JPasswordField();
        p2.setFont(new Font("arial",1,30));
        p2.setBounds(450,450,300,50);
        f.add(p2);


        l9=new JLabel("Courses");
        l9.setFont(new Font("arial",1,30));
        l9.setBounds(10,510,400,50);
        f.add(l9);

        String courses[] ={"ME/M Tech","BE/B Tech","Diploma"};
        c1=new JComboBox(courses);
        c1.setFont(new Font("arial",1,30));
        c1.setBounds(450,510,300,50);
        f.add(c1);


        l10=new JLabel("Branch");
        l10.setFont(new Font("arial",1,30));
        l10.setBounds(10,570,400,50);
        f.add(l10);

        String branch[] ={"CSE","ETE","IT","EE","EEE"};
        c2=new JComboBox(branch);
        c2.setFont(new Font("arial",1,30));
        c2.setBounds(450,570,300,50);
        f.add(c2);


        l11=new JLabel("Semester");
        l11.setFont(new Font("arial",1,30));
        l11.setBounds(10,630,400,50);
        f.add(l11);

        String semester[] ={"1","2","3","4","5","6","7","8"};
        c3=new JComboBox(semester);
        c3.setFont(new Font("arial",1,30));
        c3.setBounds(450,630,300,50);
        f.add(c3);


        b1=new JButton("Register");
        b1.setFont(new Font("arial",1,30));
        b1.setBounds(350,750,200,50);
        f.add(b1);


        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}


public class Form {
    public static void main(String args[]){
        new Student();
    }
}