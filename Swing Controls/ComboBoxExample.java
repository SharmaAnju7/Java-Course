import javax.swing.*;
import java.awt.*;

public class ComboBoxExample extends JFrame {
    String names[] = {"Anju", "Anil", "Pawan"};

    public ComboBoxExample() {
        JComboBox<String> jc = new JComboBox<>(names);
        add(jc);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ComboBoxExample();
    }
}
