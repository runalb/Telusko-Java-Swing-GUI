import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

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
    JCheckBox cb1,cb2;

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

                if (cb1.isSelected()){
                    name = name + " Dancer";
                }

                if (cb2.isSelected()){
                    name = name + " Singer";
                }
                l.setText(name);
            }
        });


        cb1 = new JCheckBox("Dancing");
        add(cb1);

        cb1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                System.out.println("Dancer");
            }
        });

        cb2 = new JCheckBox("Singing");
        add(cb2);

        l = new JLabel("Greeting");
        add(l);

    }

}
