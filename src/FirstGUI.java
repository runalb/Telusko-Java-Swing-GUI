import javax.swing.*;
import java.awt.*;

public class FirstGUI {
    public static void main(String args[]){
        Abc obj = new Abc();
    }

}

class Abc extends JFrame{
    public Abc(){
        this.setLayout(new FlowLayout());
        this.setVisible(true);
        this.setSize(400,400);
        this.setTitle("My Frame");

        JLabel l = new JLabel("Hello World");
        add(l);

        JLabel l2 = new JLabel("Welcome");
        add(l2);
    }
}