import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WindowListenerExample implements WindowListener {
    JFrame f;

    WindowListenerExample() {
        f = new JFrame("Window Key Listener");
        f.setSize(500, 500);
        f.setVisible(true);
        f.setLayout(null);
        f.addWindowListener(this); // Add WindowListener to the JFrame
    }

    public void windowOpened(WindowEvent e) {
        System.out.println("Window Opened");

    }

    public void windowClosed(WindowEvent e) {
         System.out.println("Window Closed");

    }

    public void windowClosing(WindowEvent e) {
         System.out.println("Window Closing");

    }

    public void windowIconified(WindowEvent e) {
        System.out.println("Window Iconified");

    }

    public void windowDeiconified(WindowEvent e) {
        System.out.println("Window Deiconified");

    }

    public void windowActivated(WindowEvent e) {
        System.out.println("Window Activated");

    }

    public void windowDeactivated(WindowEvent e) {
        System.out.println("WindowDeactivated");

    }

    public static void main(String[] args) {
        new WindowListenerExample();
    }
}
