package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ButtonTickTackToe extends JButton {
    TTTButtonClick listener;
    public ButtonTickTackToe(JFrame frame, String text, int x, int y, int width, int height) {
        addActionListener(listener = new TTTButtonClick(frame, this));
        setText(text);
        setBackground(Color.BLACK);
        setBounds(x, y, width, height);
        updateUI();
        repaint();
    }

    public int checkWin() {
        return listener.icon;
    }

    public void click() {
        listener.actionPerformed(new ActionEvent(this, 1, "click"));
    }
}

