import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class HandlingActionEvent extends Frame implements ActionListener {
    TextField tf;

    HandlingActionEvent() {
        // Create Components
        tf = new TextField();
        tf.setBounds(60, 50, 170, 20);
        Button b = new Button("Click me");
        b.setBounds(100, 120, 80, 30);

        // Register Listener
        b.addActionListener(this); // Passing Current Instance

        // Add
        add(tf);
        add(b);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        tf.setText("Button Clicked!");
    }

    public static void main(String[] args) {
        new HandlingActionEvent();
    }
}
