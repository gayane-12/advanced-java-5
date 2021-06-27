package timer.views.components;

import javax.swing.*;

public class LabeledField {
    private JTextField textField;
    private JLabel label;
    public static int HEIGHT = 30;
    public static int WIDTH = 150;

    public LabeledField(String label, int xOfLabel, int yOfLabel) {
        this.textField = new JTextField();
        this.label = new JLabel(label);
        this.label.setBounds(xOfLabel, yOfLabel, WIDTH, HEIGHT);
        this.textField.setBounds(xOfLabel, yOfLabel + 30, WIDTH, HEIGHT);
    }

    public JTextField getTextField() {
        return textField;
    }

    public void setTextField(JTextField textField) {
        this.textField = textField;
    }

    public JLabel getLabel() {
        return label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }


}
