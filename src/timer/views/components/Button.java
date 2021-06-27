package timer.views.components;

import javax.swing.*;
import java.awt.event.ActionListener;


public class Button {
    private JButton button;
    public static int HEIGHT = 30;
    public static int WIDTH = 100;

    public Button(String name, int x, int y) {
        this.button = new JButton(name);
        this.button.setBounds(x, y, WIDTH, HEIGHT);
    }

    public JButton getButton() {
        return button;
    }

    public void setButton(JButton button) {
        this.button = button;
    }

    public void addAction(ActionListener fn) {
        this.button.addActionListener(fn);
    }

}
