import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.InputMismatchException;
class Welcome implements ActionListener
{
    JFrame f;
    JLabel lbl1,lbl2,lbl3;
    JTextField t1,t2,t3;
    JButton b1,b2,b3,b4;
    Welcome()
    {
        f=new JFrame();
        f.setLayout(null);
        f.setSize(500, 400);
        f.setTitle("A Simple Calculator");
        
        
        lbl1=new JLabel("First No");
        lbl1.setFont(new Font("arial",1,30));
        lbl1.setBounds(10,10,240,50);
        f.add(lbl1);
        t1=new JTextField();
        t1.setFont(new Font("arial",1,30));
        t1.setBounds(250,10,100,50);
        f.add(t1);


        lbl2=new JLabel("Second No");
        lbl2.setFont(new Font("arial",1,30));
        lbl2.setBounds(10,70,240,50);
        f.add(lbl2);
        t2=new JTextField();
        t2.setFont(new Font("arial",1,30));
        t2.setBounds(250,70,100,50);
        f.add(t2);


        lbl3=new JLabel("Result");
        lbl3.setFont(new Font("arial",1,30));
        lbl3.setBounds(10,130,240,50);
        f.add(lbl3);
        t3=new JTextField();
        t3.setFont(new Font("arial",1,30));
        t3.setBounds(250,130,100,50);
        f.add(t3);
        
        
        b1=new JButton("+");
        b1.setFont(new Font("arial",1,30));
        b1.setBounds(10,190,100,50);
        b1.addActionListener(this);
        f.add(b1);

        b2=new JButton("-");
        b2.setFont(new Font("arial",1,30));
        b2.setBounds(120,190,100,50);
        b2.addActionListener(this);
        f.add(b2);

        b3=new JButton("X");
        b3.setFont(new Font("arial",1,30));
        b3.setBounds(230,190,100,50);
        b3.addActionListener(this);
        f.add(b3);

        b4=new JButton("%");
        b4.setFont(new Font("arial",1,30));
        b4.setBounds(340,190,100,50);
        b4.addActionListener(this);
        f.add(b4);



        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        String op=e.getActionCommand();
        int c=0;
        try{
        int a=Integer.parseInt(t1.getText());
        int b=Integer.parseInt(t2.getText());
        switch(op)
        {
            case "+": c=a+b; break;
            case "-": c=a-b; break;
            case "X": c=a*b; break;
            case "%": c=a/b; break;
        }
        }catch(ArithmeticException s){
            JOptionPane.showMessageDialog(null,"Error");
        }
        catch(InputMismatchException s){
            JOptionPane.showMessageDialog(null,"Error");
        }
        catch(NumberFormatException s){
            JOptionPane.showMessageDialog(null,"Error");
        }
        t3.setText(""+c);
    }
}
class EX1{
    public static void main(String[] args) {
        new Welcome();
    }
}