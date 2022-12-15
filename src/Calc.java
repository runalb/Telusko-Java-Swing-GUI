import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calc {
    public static void main (String args[]){
        AddSub obj = new AddSub();
    }
}

class AddSub extends JFrame {
    JTextField t1,t2;
    JButton b1,b2;
    JLabel l;

    public AddSub(){
        this.setLayout(new FlowLayout());
        this.setVisible(true);
        this.setSize(400,400);
        this.setTitle("Calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        t1 = new JTextField(10);
        add(t1);

        t2 = new JTextField(10);
        add(t2);


        b1 = new JButton("Addition");
        add(b1);

        // Using Annonymous Class
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
                int value = num1 + num2;
                l.setText(""+value);
            }
        });


        b2 = new JButton("Substraction");
        add(b2);

        // Using Annonymous Class
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
                int value = num1 - num2;
                l.setText(""+value);
            }
        });


        l = new JLabel("Result");
        add(l);
    }
}

