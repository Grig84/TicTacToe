package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ButtonReset extends JButton {
    ResetButtonClick listener;
    public ButtonReset(JFrame frame, String text, int x, int y, int width, int height) {
        addActionListener(listener = new ResetButtonClick(frame, this));
        setText(text);
        setBackground(Color.WHITE);
        setBounds(x, y, width, height);
        updateUI();
        repaint();
    }

    public void click() {
        listener.actionPerformed(new ActionEvent(this, 1, "click"));
    }
}
