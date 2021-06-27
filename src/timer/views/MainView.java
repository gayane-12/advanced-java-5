package timer.views;

import javax.swing.*;

public class MainView {
    private JFrame frame;
    static int HEIGHT = 400;
    static int WIDTH = 400;

    public MainView(String frameName) {
        this.frame = new JFrame(frameName);
        this.frame.setSize(WIDTH, HEIGHT);
        this.frame.setLayout(null);
    }

    public void addLabelField(JTextField field, JLabel label) {
        this.frame.add(field);
        this.frame.add(label);
    }

    public void addResultField(JLabel label) {
        this.frame.add(label);
    }

    public void addButton(JButton button) {
        this.frame.add(button);
    }

    public void show() {
        this.frame.setVisible(true);
    }

}
