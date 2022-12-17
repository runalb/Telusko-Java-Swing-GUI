import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserInput {
    public static void main(String[] args) {
        RadioDemo r = new RadioDemo();
    }
}

class RadioDemo extends JFrame{
    JTextField t1;
    JButton b;
    JRadioButton r1,r2;
    JLabel l;

    public RadioDemo(){
        this.setLayout(new FlowLayout());
        this.setVisible(true);
        this.setSize(400,400);
        this.setTitle("UserInput");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        t1 = new JTextField(20);
        add(t1);

        r1 = new JRadioButton("Male");
        add(r1);

        r2 = new JRadioButton("Female");
        add(r2);

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        b = new JButton("ok");
        add(b);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = t1.getText();
                if(r1.isSelected()){
                    name = "Mr. "+name;
                } else {
                    name = "Ms. "+name;
                }
                l.setText(name);
            }
        });

        l = new JLabel("Greeting");
        add(l);

    }

}
