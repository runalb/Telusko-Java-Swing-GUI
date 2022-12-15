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

    public Addition(){
        this.setLayout(new FlowLayout());
        this.setVisible(true);
        this.setSize(400,400);
        this.setTitle("My Frame");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField t1 = new JTextField(20);
        add(t1);

        JTextField t2 = new JTextField(20);
        add(t2);

        JButton b = new JButton("Addition");
        b.addActionListener(this);
        add(b);

        JLabel l = new JLabel("Result");
        add(l);
    }


    public void actionPerformed(ActionEvent ae) {

    }
}

