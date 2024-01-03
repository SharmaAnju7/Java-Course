import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyListenerExample implements KeyListener {
    JFrame f;
    JTextField a;

    KeyListenerExample() {
        f = new JFrame("Key Listener");
        f.setSize(500, 500);
        f.setVisible(true);
        f.setLayout(null);
        a = new JTextField();
        a.setBounds(100, 100, 300, 200);
        a.addKeyListener(this); 
        f.add(a);
    }

    public static void main(String[] args) {
        new KeyListenerExample();
    }

    // Implement KeyListener methods
    public void keyPressed(KeyEvent e) {
        System.out.println("Key Pressed");
    }

    public void keyReleased(KeyEvent e) {
        System.out.println("Key Released");
    }

    public void keyTyped(KeyEvent e) {
        System.out.println("Key Typed"+e.getKeyChar());
    }
}
