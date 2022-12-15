import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddGui {
    public static void main (String args[]){
        Addition obj = new Addition();
    }
}

class Addition extends JFrame implements ActionListener {

    JTextField t1,t2;
    JButton b;
    JLabel l;

    public Addition(){
        this.setLayout(new FlowLayout());
        this.setVisible(true);
        this.setSize(400,400);
        this.setTitle("My Frame");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        t1 = new JTextField(20);
        add(t1);

        t2 = new JTextField(20);
        add(t2);

        b = new JButton("Addition");
        b.addActionListener(this);
        add(b);

        l = new JLabel("Result");
        add(l);
    }


    public void actionPerformed(ActionEvent ae) {
        int num1 = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());
        int value = num1 + num2;
        l.setText(""+value);
    }
}

