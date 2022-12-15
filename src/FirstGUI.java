import javax.swing.*;

public class FirstGUI {
    public static void main(String args[]){
        Abc obj = new Abc();
    }

}

class Abc extends JFrame{
    public Abc(){
        JLabel l = new JLabel("Hello World");
        add(l);

        this.setVisible(true);
        this.setSize(400,400);
        this.setTitle("My Frame");
    }
}