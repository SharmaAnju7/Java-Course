import javax.swing.*;

public class SliderExample extends JFrame {
    public SliderExample() {
        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 50, 25);

        slider.setMinorTickSpacing(2);
        slider.setMajorTickSpacing(10);

        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        JPanel panel = new JPanel();  // Fix the import here
        panel.add(slider);
        add(panel);
    }

    public static void main(String[] args) {
        SliderExample frame = new SliderExample();
        frame.pack();
        frame.setVisible(true);
    }
}
