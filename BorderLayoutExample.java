import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample {
    JFrame f1;
    JButton b1, b2, b3, b4, b5;

    BorderLayoutExample() {
        f1 = new JFrame("Border layout");
        f1.setSize(500, 500);
        f1.setLayout(new BorderLayout());
        f1.setVisible(true);

        b1 = new JButton("button1");
        b2 = new JButton("button2");
        b3 = new JButton("button3");
        b4 = new JButton("button4");
        b5 = new JButton("button5");
       // b5.setSize(width:100,height:100);
       f1.setLayout(new BorderLayout(10,10));

        f1.add(b1, BorderLayout.EAST);
        f1.add(b2, BorderLayout.WEST);
        f1.add(b3, BorderLayout.NORTH);
        f1.add(b4, BorderLayout.SOUTH);
        f1.add(b5, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        new BorderLayoutExample();
    }
}
