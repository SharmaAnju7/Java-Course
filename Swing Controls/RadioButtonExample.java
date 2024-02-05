import javax.swing.*;
public class RadioButtonExample{
    JFrame f;
    RadioButtonExample(){
        f = new JFrame();
        JRadioButton b1 = new JRadioButton("A) Male");
        JRadioButton b2 = new JRadioButton("B) Female");

        b1.setBounds(75,50,100,30);
         b2.setBounds(75,100,100,30);
         ButtonGroup bg = new ButtonGroup();
         bg.add(b1);
         bg.add(b2);
         f.add(b1);
         f.add(b2);

         f.setSize(300, 300);
         f.setLayout(null);
         f.setVisible(true);

    }
    public static void main(String[] args){
        new RadioButtonExample();

    }
}