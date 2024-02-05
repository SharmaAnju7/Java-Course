import javax.swing.*;
import java.awt.*;
public class Test extends JFrame
{
    public Test()
    {
        JCheckBox jcb = new JCheckBox("yes");
        add(jcb);
        jcb= new JCheckBox("no");
        add(jcb);
         jcb= new JCheckBox("maybe");
        add(jcb);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setVisible(true);

    }
    public static void main(String[]args){
        new Test();
    }
}