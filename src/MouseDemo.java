import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseDemo {
    public static void main(String[] args) {
        Mouse m = new Mouse();
    }
}

class Mouse extends JFrame{
    public Mouse(){
        this.setLayout(new FlowLayout());
        this.setVisible(true);
        this.setSize(400,400);
        this.setTitle("MouseDemo");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                System.out.println(x+","+y);
            }
        });

    }
}
