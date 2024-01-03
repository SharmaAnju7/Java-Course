import javax.swing.*;

class MenuExample {
    JFrame main;
    JMenuBar jbar;
    JMenu menu, submenu;
    JMenuItem i1, i2, i3, i4, i5, i6;

    MenuExample() {
        main = new JFrame("Menu and Menu Items");
        main.setSize(600, 600);

        jbar = new JMenuBar();
        menu = new JMenu("File");
        submenu = new JMenu("Save As");

        i1 = new JMenuItem("Item 1");
        i2 = new JMenuItem("Item 2");
        i3 = new JMenuItem("Item 3");
        i4 = new JMenuItem("Item 4");
        i5 = new JMenuItem("Item 5");
        i6 = new JMenuItem("Item 6");

        main.setJMenuBar(jbar);
        jbar.add(menu);
        menu.add(submenu);

        submenu.add(i1);
        submenu.add(i2);
        submenu.add(i3);
        submenu.add(i4);
        submenu.add(i5);
        submenu.add(i6);

        main.setLayout(null);
        main.setVisible(true);
        main.setLocationRelativeTo(null);
    }

    public static void main(String args[]) {
        new MenuExample();
    }
}
