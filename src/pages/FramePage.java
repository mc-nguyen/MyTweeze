package pages;

import javax.swing.*;

public class FramePage extends JFrame {
    public FramePage(JPanel panel) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setContentPane(panel);
        pack();
        setLocationRelativeTo(null);
        setTitle(panel.getName());
    }
}
