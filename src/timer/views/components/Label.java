package timer.views.components;

import javax.swing.*;

public class Label {
    private JLabel label;
    public static int HEIGHT = 30;
    public static int WIDTH = 150;

    public Label(String name, int x, int y) {
        this.label = new JLabel(name);
        this.label.setBounds(x, y, WIDTH, HEIGHT);
    }

    public JLabel getLabel() {
        return label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }

}
